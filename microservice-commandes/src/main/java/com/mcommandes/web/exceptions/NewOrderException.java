package com.mcommandes.web.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ResponseStatus(INTERNAL_SERVER_ERROR)
public class NewOrderException extends RuntimeException {
    public NewOrderException(String message) {
        super(message);
    }
}
