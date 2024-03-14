package com.banking.bank_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.bank_app.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
