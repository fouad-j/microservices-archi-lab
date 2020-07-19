package com.mcommandes.web.controller;


import com.mcommandes.repository.OrdersRepository;
import com.mcommandes.model.Order;
import com.mcommandes.web.exceptions.NewOrderException;
import com.mcommandes.web.exceptions.OrderNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.util.Optional.of;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class OrderController {

    @Autowired
    OrdersRepository ordersRepository;

    @PostMapping(value = "/orders")
    public ResponseEntity<Order> newOrder(@RequestBody Order order) {
        return of(ordersRepository.save(order))
                .map(newOrder -> new ResponseEntity<>(newOrder, CREATED))
                .orElseThrow(() -> new NewOrderException("Error occurred while trying to add this order"));
    }

    @GetMapping(value = "/orders/{orderId}")
    public Order getOrder(@PathVariable int orderId) {
//        return ordersRepository.findById(orderId)
//                .orElseThrow(() -> new OrderNotFoundException("Order doesn't exist"));
    return null;
    }
}
