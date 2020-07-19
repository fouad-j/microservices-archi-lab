package com.jfouad.mcommerceclient.controller;

import com.jfouad.mcommerceclient.model.Order;
import com.jfouad.mcommerceclient.remote.OrderProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class OrderController {

    private final OrderProvider orderProvider;

    public OrderController(OrderProvider orderProvider) {
        this.orderProvider = orderProvider;
    }

    @RequestMapping(value = "/order-product/{productId}/{amount}")
    public String orderProduct(@PathVariable int productId, @PathVariable Double amount, Model model) {
        Order order = new Order();

        order.setProductId(productId);
        order.setQuantity(1);
        order.setDateOrder(new Date());

        Order newOrder = orderProvider.newOrder(order);

        model.addAttribute("commande", newOrder);
        model.addAttribute("montant", amount);

        return "Payment";
    }
}