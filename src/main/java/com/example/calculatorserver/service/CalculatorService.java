package com.example.calculatorserver.service;

import com.example.calculatorserver.model.Operation;

import java.util.List;
import java.util.Optional;

public interface CalculatorService {

    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);

    List<Operation> getAllOperations();

    Optional<Operation> getOperationById(Long id);

    List<Operation> getOperationsByType(String type);
}
