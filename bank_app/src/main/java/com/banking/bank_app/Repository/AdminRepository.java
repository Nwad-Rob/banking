package com.banking.bank_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bank_app.Model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    
}
