package com.kodilla.good.patterns.challenges;

public class Table implements Product {
    private String name;
    private double price;
    private int amount;

    public Table(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "(" + name + ", amount: " + amount + ", price: " + price + ")";
    }
}
