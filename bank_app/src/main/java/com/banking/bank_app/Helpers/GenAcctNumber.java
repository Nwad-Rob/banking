package com.banking.bank_app.Helpers;

import java.util.Random;

public class GenAcctNumber {
    //Can also be classified as catalog numbers

    public static int generateAcctNumber() {
        int accountNumber;
        Random rand = new Random();
        int bound = 1000;
        accountNumber = bound * rand.nextInt(bound);
        return  accountNumber;
    }

}
