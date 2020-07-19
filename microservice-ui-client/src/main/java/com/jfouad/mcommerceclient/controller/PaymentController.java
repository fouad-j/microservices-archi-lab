package com.jfouad.mcommerceclient.controller;

import com.jfouad.mcommerceclient.model.Payment;
import com.jfouad.mcommerceclient.remote.PaymentProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ThreadLocalRandom;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
public class PaymentController {

    private final PaymentProvider paymentProvider;

    public PaymentController(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    @RequestMapping(value = "/pay-order/{idOrder}/{amount}")
    public String payOrder(@PathVariable int idOrder, @PathVariable Double amount, Model model) {
        Payment paymentCommand = new Payment();

        paymentCommand.setOrderId(idOrder);
        paymentCommand.setAmount(amount);
        paymentCommand.setCardNumber(randomCardNumber());

        ResponseEntity<Payment> payment = paymentProvider.payOrder(paymentCommand);

        model.addAttribute("paiementOk", payment.getStatusCode() == CREATED); // on envoi un Boolean paiementOk à la vue

        return "Confirmation";
    }

    private Long randomCardNumber() {
        return ThreadLocalRandom.current().nextLong(1000000000000000L, 9000000000000000L);
    }
}