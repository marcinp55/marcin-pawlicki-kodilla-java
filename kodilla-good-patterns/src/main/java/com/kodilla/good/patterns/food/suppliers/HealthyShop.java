package com.kodilla.good.patterns.food.suppliers;

import com.kodilla.good.patterns.food.Orderr;
import com.kodilla.good.patterns.food.OrderCalculator;
import com.kodilla.good.patterns.food.products.Productt;

public class HealthyShop implements Supplier {
    private String name = "HealthyShop";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double process(Orderr orderr) {
        double totalPrice = OrderCalculator.calculateTotalPrice(orderr);
        int numberOfProducts = 0;

        for (Productt productt : orderr.getProductts()) {
            numberOfProducts += productt.getAmount();
        }

        if (numberOfProducts >= 100 && numberOfProducts < 200) {
            totalPrice *= 0.9;
        }
        if (numberOfProducts >= 200 && numberOfProducts < 500) {
            totalPrice *= 0.8;
        }
        if (numberOfProducts >= 500) {
            totalPrice *= 0.75;
        }
        return totalPrice;
    }
}
