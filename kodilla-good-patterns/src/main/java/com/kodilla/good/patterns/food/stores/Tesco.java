package com.kodilla.good.patterns.food.stores;

public class Tesco implements Store {
    String name = "Tesco";
    double moneyBalance = 1000;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMoneyBalance() {
        return moneyBalance;
    }
}
