package com.mpaiement.web.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ResponseStatus(INTERNAL_SERVER_ERROR)
public class PaymentException extends RuntimeException {


    public PaymentException(String message) {
        super(message);
    }
}
