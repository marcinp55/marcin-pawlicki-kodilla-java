package com.kodilla.good.patterns.food.stores;

public class Auchan implements Store {
    String name = "Auchan";
    double moneyBalance = 3000;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMoneyBalance() {
        return moneyBalance;
    }
}
