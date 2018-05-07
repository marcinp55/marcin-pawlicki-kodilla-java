package com.kodilla.good.patterns.food.stores;

public class Netto implements Store {
    String name = "Netto";
    double moneyBalance = 2000;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMoneyBalance() {
        return moneyBalance;
    }
}
