package com.academy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.UNPROCESSABLE_ENTITY)
public class InvalidCountryCodeException extends RuntimeException {

    public InvalidCountryCodeException(String message) {
        super(message);
    }
}
