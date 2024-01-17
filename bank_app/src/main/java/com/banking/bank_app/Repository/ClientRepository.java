package com.banking.bank_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bank_app.Model.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
    
}
