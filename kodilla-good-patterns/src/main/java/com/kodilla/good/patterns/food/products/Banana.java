package com.kodilla.good.patterns.food.products;

public class Banana implements Productt {
    String name = "Banana";
    double price = 2;
    int amount;

    public Banana(int amount) {
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
