package com.banking.bank_app.Model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table (name = "Payments")
public class Payments {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int payment_id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name = "account_id")
    private int account_id;

    @Column(name = "beneficiary")
    private String beneficiary;

    @Column(name = "beneficiary_acct_no")
    private String beneficiaryAcctNo;

    @Column( name = "amount")
    private double amount;

    @Column (name = "reference_no")
    private String refernceNo;

    @Column(name = "status")
    private String status;

    @Column (name = "reason_code")
    private String reasonCode;

    @Column(name = "Created_at")
    private Date createdAt;


     @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }   


}
