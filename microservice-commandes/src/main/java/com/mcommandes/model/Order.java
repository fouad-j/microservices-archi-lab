package com.mcommandes.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private int id;

    private Integer productId;

    private Date dateOrder;

    private Integer quantity;

    private Boolean paidOrder;
}
