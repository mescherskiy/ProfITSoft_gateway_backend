package com.example.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients
public class ServiceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBackendApplication.class, args);
    }

}
