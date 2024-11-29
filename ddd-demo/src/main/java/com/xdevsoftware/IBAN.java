package com.xdevsoftware;


public class IBAN {
    
    public IBAN(String iban) {
        if (iban == null) {
            throw new IllegalArgumentException("IBAN must not be null");
        }

        if (iban.length() != 22) {
            throw new IllegalArgumentException("IBAN must be 22 characters long");
        }
        


    }
}
