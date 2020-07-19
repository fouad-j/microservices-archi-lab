package com.mpaiement.web.controller;

import com.mpaiement.model.Payment;
import com.mpaiement.repository.PaymentRepository;
import com.mpaiement.web.exceptions.ExistingPaymentException;
import com.mpaiement.web.exceptions.PaymentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.nonNull;
import static java.util.Optional.of;

@RestController
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

    @PostMapping(value = "/payment")
    public ResponseEntity<Payment> payOrder(@RequestBody Payment payment) {

        Payment existingPayment = paymentRepository.findByOrderId(payment.getOrderId());

        if (nonNull(existingPayment)) throw new ExistingPaymentException("Order already paid");

        return of(paymentRepository.save(payment))
                .map(newPayment -> new ResponseEntity<>(newPayment, HttpStatus.CREATED))
                .orElseThrow(() -> new PaymentException("An error occurred during payment, please retry later"));
    }


}
