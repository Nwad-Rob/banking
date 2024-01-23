package com.banking.bank_app.ExceptionHandeling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final Long serialversionID = 1L;

    public ResourceNotFoundException (String message){
        super(message);
    }
}
