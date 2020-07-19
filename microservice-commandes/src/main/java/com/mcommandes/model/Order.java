package com.mcommandes.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_table") // https://stackoverflow.com/questions/27987068/spring-boot-hibernate-syntax-error-in-sql-statement/45322933
public class Order {

    @Id
    @GeneratedValue
    private int id;

    private Integer productId;

    private Date dateOrder;

    private Integer quantity;

    private Boolean paidOrder;
}
