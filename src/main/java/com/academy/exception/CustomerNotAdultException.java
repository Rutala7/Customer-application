package com.academy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.UNPROCESSABLE_ENTITY)
public class CustomerNotAdultException extends RuntimeException {

    public CustomerNotAdultException(String message) {
        super(message);
    }
}
