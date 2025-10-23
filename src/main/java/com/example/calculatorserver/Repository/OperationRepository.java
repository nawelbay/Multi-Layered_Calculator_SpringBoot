package com.example.calculatorserver.Repository;

import com.example.calculatorserver.model.Operation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OperationRepository {
    private List<Operation> operations = new ArrayList<>();
    private Long nextId = 1L;

    public Operation save(Operation op) {
        op.setId(nextId++);
        operations.add(op);
        return op;
    }

    public List<Operation> findAll() {
        return operations;
    }

    public Optional<Operation> findById(Long id) {
        for (Operation op : operations) {
            if (op.getId().equals(id)) {
                return Optional.of(op);
            }
        }
        return Optional.empty();
    }

    public List<Operation> findByType(String type) {
        List<Operation> ops = new ArrayList<>();
        for (Operation op : operations) {
            if (op.getType().equals(type)) {
                ops.add(op);
            }
        } return ops;
    }

    public void clear() {
        operations.clear();
        nextId = 1L;
    }
}
