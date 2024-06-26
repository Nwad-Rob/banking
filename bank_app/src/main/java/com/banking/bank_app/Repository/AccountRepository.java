package com.banking.bank_app.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.banking.bank_app.Model.Account;
import org.springframework.transaction.annotation.Transactional;

public interface AccountRepository extends JpaRepository<Account,Long> {
    
    @Query(value = "SELECT * FROM Accounts WHERE user_id = :user_id", nativeQuery = true)
    List<Account> getUserAccountById(@Param("user_id") Long user_id);

    @Query(value = "SELECT sum(balance) FROM Accounts WHERE user_id = :user_id", nativeQuery = true)
    BigDecimal getBalance(@Param("user_id") Long user_id);

    @Modifying
    @Query(value = "INSERT INTO Accounts(userid,account_number,account_name,account_type) VALUES"+
            "(:userid,:account_number,:account_name,:account_type)", nativeQuery = true)
    @Transactional
    void createCatalogAccount(@Param("user_id") Long user_id,
                              @Param("account_number") String account_number,
                              @Param("account_name") String account_name,
                              @Param("account_type") String account_type);
}
