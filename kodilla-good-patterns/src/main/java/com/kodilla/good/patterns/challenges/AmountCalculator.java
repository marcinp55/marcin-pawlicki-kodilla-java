package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class AmountCalculator {
    public double calculateAmount(ArrayList<Product> products) {
        double amount = 0;

        for (Product product : products) {
            amount += product.getAmount() * product.getPrice();
        }
        return amount;
    }
}
