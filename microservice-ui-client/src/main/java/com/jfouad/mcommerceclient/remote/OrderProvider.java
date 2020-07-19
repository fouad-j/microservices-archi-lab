package com.jfouad.mcommerceclient.remote;

import com.jfouad.mcommerceclient.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "microservice-orders", url = "${remotes.orders.url}")
public interface OrderProvider {

    @PostMapping(value = "/orders")
    Order newOrder(@RequestBody Order order);
}