package com.banking.bank_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bank_app.Model.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
    
}
