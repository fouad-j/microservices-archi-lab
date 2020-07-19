package com.jfouad.mcommerceclient.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private int id;

    private Integer productId;

    private Date dateOrder;

    private Integer quantity;

    private Boolean paidOrder;
}
