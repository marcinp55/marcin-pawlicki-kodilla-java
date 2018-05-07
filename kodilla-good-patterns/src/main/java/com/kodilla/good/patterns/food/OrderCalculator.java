package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.products.Productt;

public class OrderCalculator {
    public static double calculateTotalPrice(Orderr orderr) {
        double amountToPay = orderr.getAmountToPay();
        for (Productt productt : orderr.getProductts()) {
            amountToPay += productt.getAmount() * productt.getPrice();
        }
        orderr.setAmountToPay(amountToPay);
        return amountToPay;
    }
}
