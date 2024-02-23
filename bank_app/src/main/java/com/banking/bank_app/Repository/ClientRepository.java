package com.banking.bank_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bank_app.Model.User;

public interface ClientRepository extends JpaRepository<User,Long> {
    
}
