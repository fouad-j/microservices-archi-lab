package com.jfouad.mcommerceclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {

    private int id;

    private String title;

    private String description;

    private String image;

    private Double price;
}