package com.banking.bank_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.banking.bank_app.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Modifying
    @Query(value = "INSERT INTO Users (first_name,last_name,email, password,token,code) VALUES" +
            "(:first_name, :last_name, :email, :password, :token, :code)", nativeQuery = true)
    @Transactional
    void registerUser(@Param("first_name") String first_name,
            @Param("last_name") String last_name,
            @Param("email") String email,
            @Param("password") String password,
            @Param("token") String token,
            @Param("code") int code);

    // The link after verifying the Account
    @Modifying
    @Query(value = "UPDATE Users SET token = null, code = null, verified = TRUE, verified_at = Now()" +
            ", updated_at = Now() WHERE token = :token AND code = :code ", nativeQuery = true)
    @Transactional
    void verifyAccount(@Param("token") String token,
                       @Param("code") int code);

    //Prevents the user from running the verification button
    @Query(value = "SELECT token FROM Users WHERE token = :token", nativeQuery = true)
    String checkToken(@Param("token") String token);



}