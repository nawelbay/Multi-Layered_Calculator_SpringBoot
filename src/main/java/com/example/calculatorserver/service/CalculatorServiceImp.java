package com.example.calculatorserver.service;

import com.example.calculatorserver.Repository.OperationRepository;
import com.example.calculatorserver.model.Operation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalculatorServiceImp implements CalculatorService {
    private final OperationRepository operationRepository;

    public CalculatorServiceImp(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }
    @Override
    public double add(double a, double b) {
        double result = a + b;
        Operation op = new Operation(null, "ADD", a, b, result);
        operationRepository.save(op);
        return result;
    }

    @Override
    public double subtract(double a, double b) {
        double result = a - b;
        Operation op = new Operation(null, "SUB", a, b, result);
        operationRepository.save(op);
        return result;
    }

    @Override
    public double multiply(double a, double b) {
        double result= a*b;
        Operation op = new Operation(null, "MUL", a, b, result);
        operationRepository.save(op);
        return result;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Division by zero is not allowed");
        else {
            double result= a/b;
            Operation op = new Operation(null, "DIV", a, b, result);
            operationRepository.save(op);
            return result;
        }
    }

    @Override
    public List<Operation> getAllOperations() {
        return this.operationRepository.findAll();
    }

    @Override
    public Optional<Operation> getOperationById(Long id) {
        return this.operationRepository.findById(id);
    }

    @Override
    public List<Operation> getOperationsByType(String type) {
        return this.operationRepository.findByType(type);
    }
}
