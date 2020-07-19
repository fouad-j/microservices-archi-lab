package com.jfouad.mcommerceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class McommerceclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(McommerceclientApplication.class, args);
    }

}
