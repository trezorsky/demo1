package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Calculator {

    @Autowired
    private List<Operation> operations;

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    public void calc(double a, double b) {
        for (Operation operation : operations) {
            System.out.println(operation.getResult(a, b));
        }
    }
}