package com.jfouad.mcommerceclient.remote;

import com.jfouad.mcommerceclient.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "microservice-payments", url = "${remotes.payments.url}")
public interface PaymentProvider {

    @PostMapping(value = "/payments")
    ResponseEntity<Payment> payOrder(@RequestBody Payment payment);

}