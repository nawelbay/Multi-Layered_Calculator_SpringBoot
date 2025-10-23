package com.example.calculatorserver.controller;
import com.example.calculatorserver.model.Operation;
import com.example.calculatorserver.service.CalculatorService;
import org.springframework.web.bind.annotation.*;
;import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {

        return calculatorService.add(a,b);   }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {

            return calculatorService.divide(a, b); }
    @GetMapping("/history")
    public List<Operation> getAll() {
        return calculatorService.getAllOperations();
    }

    @GetMapping("/history/{id}")
    public Optional<Operation> getById(@PathVariable Long id) {
        return calculatorService.getOperationById(id);
    }

    @GetMapping("/history/{type}")
    public List<Operation> getByType(@PathVariable String type) {
        return calculatorService.getOperationsByType(type);
    }
}
