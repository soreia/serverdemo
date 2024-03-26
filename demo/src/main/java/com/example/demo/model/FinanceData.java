package com.example.demo.model;

import lombok.Data;

@Data
public class FinanceData {
    private String name;
    private String date;
    private double amount;
    
    public FinanceData(String name, String date, double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }
    
    // Getters and setters for the fields
    // ...
}