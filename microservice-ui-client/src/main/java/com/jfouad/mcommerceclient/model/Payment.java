package com.jfouad.mcommerceclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private int id;

    private Integer orderId;

    private Double amount;

    private Long cardNumber;
}
