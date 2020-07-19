package com.mpaiement.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private Integer orderId;

    private Integer amount;

    private Long cardNumber;
}
