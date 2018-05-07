package com.kodilla.good.patterns.food.products;

public class Orange implements Productt {
    String name = "Orange";
    double price = 1;
    int amount;

    public Orange(int amount) {
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
        return "(" + name +
                ", Price: " + price +
                ", Amount: " + amount + ")";
    }
}
