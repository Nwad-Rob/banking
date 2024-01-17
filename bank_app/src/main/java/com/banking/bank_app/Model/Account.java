package com.banking.bank_app.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AccountNumber;

    @Column(name = "First_name")
    private String firstname;

    @Column(name = "Last_name")
    private String lastName;

    @Column(name = "Account_type")
    private String AccountType;

    @Column(name = "Status")
    private String status;


    public Long getAccountNumber() {
        return this.AccountNumber;
    }

    public void setAccountNumber(Long AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountType() {
        return this.AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
