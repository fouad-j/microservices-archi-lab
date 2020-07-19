package com.mpaiement.web.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.CONFLICT;

@ResponseStatus(CONFLICT)
public class ExistingPaymentException extends RuntimeException {

    public ExistingPaymentException(String message) {
        super(message);
    }
}
