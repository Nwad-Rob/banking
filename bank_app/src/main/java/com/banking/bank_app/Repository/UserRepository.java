package com.banking.bank_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.banking.bank_app.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Modifying
    @Query(value = "INSERT INTO Users (first_Name,last_Name,email, password,token,code) VALUES" +
                    "(:first_Name, :last_Name, :email, :password, :token, :code)",nativeQuery = true)
    @Transactional
    void registerUser(@Param("first_Name") String first_Name,
                      @Param("last_Name") String last_Name,
                      @Param("email") String email,
                      @Param("password") String password,
                      @Param("token") String token,
                      @Param("code") int code);
}
