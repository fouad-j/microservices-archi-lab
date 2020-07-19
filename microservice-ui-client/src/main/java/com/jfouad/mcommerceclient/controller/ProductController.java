package com.jfouad.mcommerceclient.controller;

import com.jfouad.mcommerceclient.model.Product;
import com.jfouad.mcommerceclient.remote.ProductProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    private final ProductProvider productProvider;

    public ProductController(ProductProvider productProvider) {
        this.productProvider = productProvider;
    }

    @RequestMapping("/")
    public String home(Model model) {
        List<Product> products = productProvider.productsList();

        model.addAttribute("products", products);

        return "Home";
    }

    @RequestMapping("/details-product/{id}")
    public String ficheProduit(@PathVariable int id, Model model) {

        Product product = productProvider.getProduct(id);

        model.addAttribute("product", product);

        return "DetailsProduct";
    }

}