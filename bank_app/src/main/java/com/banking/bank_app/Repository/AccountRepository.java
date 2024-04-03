package com.banking.bank_app.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.banking.bank_app.Model.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
    
    @Query(value = "SELECT * FROM Accounts WHERE user_id = :user_id", nativeQuery = true)
    List<Account> getUserAccountById(@Param("user_id") Long user_id);

    @Query(value = "SELECT balance FROM Accounts WHERE user_id = :user_id", nativeQuery = true)
    BigDecimal getBalance(@Param("user_id") Long user_id);
}
