package com.banking.bank_app.Helpers;

import java.util.UUID;

public class Token {
    public static String generateToken(){
        
        String token = UUID.randomUUID().toString();
        return token;
    }
}
