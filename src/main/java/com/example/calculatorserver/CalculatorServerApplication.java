package com.example.calculatorserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculatorServerApplication.class, args);

        System.out.println(" Calculator REST Service running on port 8080");
    }
}
