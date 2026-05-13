package com.example.monolith.model;

public class User {
    
    private Long id;
    private String name;
    private double income;
    private double savings;

    public User() {
        this(0L, "default", 0, 0);
    }

    public User(Long id, String name, double income, double savings) {
        this.id = id;
        this.name = name;
        this.income = income;
        this.savings = savings;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public double getSavings() {
        return savings;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    public void setSavings(Long savings) {
        this.savings = savings;
    }
}