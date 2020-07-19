package com.mproduits.web.controller;

import com.mproduits.model.Product;
import com.mproduits.repository.ProductRepository;
import com.mproduits.web.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "/products")
    public List<Product> productsList() {

        List<Product> products = productRepository.findAll();

        if (products.isEmpty()) throw new ProductNotFoundException("Stock is empty");

        return products;
    }

    @GetMapping(value = "/products/{productId}")
    public Product getProduct(@PathVariable int productId) {

        return productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException("Product " + productId + " doesn't exist"));
    }
}

