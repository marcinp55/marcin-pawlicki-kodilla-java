package com.kodilla.good.patterns.food.products;

public class Apple implements Productt {
    String name = "Apple";
    double price = 0.5;
    int amount;

    public Apple(int amount) {
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
