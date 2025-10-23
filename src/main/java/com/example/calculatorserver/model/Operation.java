package com.example.calculatorserver.model;

import java.time.LocalDateTime;

public class Operation {

    private Long id;
    private String type; // ADD, SUBTRACT, MULTIPLY, DIVIDE
    private double a;
    private double b;
    private double result;
    private LocalDateTime createdAt;

    public Operation(Long id, String type, double a, double b, double result) {
        this.id = id;
        this.type = type;
        this.a = a;
        this.b = b;
        this.result = result;
        this.createdAt = LocalDateTime.now();
    }

    public Operation() {
       this.createdAt= LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getResult() {
        return result;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", result=" + result +
                ", createdAt=" + createdAt +
                '}';
    }
}
