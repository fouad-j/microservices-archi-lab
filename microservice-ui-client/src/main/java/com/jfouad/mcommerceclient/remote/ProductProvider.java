package com.jfouad.mcommerceclient.remote;

import com.jfouad.mcommerceclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-products", url = "${remotes.products.url}")
public interface ProductProvider {

    @GetMapping(value = "/products")
    List<Product> productsList();

    @GetMapping(value = "/products/{productId}")
    Product getProduct(@PathVariable int productId);

}