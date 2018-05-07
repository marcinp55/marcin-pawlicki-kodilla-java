package com.kodilla.good.patterns.food.suppliers;

import com.kodilla.good.patterns.food.Orderr;
import com.kodilla.good.patterns.food.OrderCalculator;

public class GlutenFreeShop implements Supplier {
    private String name = "GlutenFreeShop";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double process(Orderr orderr) {
        double totalPrice = OrderCalculator.calculateTotalPrice(orderr);
        int numberOfTypesOfProducts = orderr.getProductts().size();

        if (numberOfTypesOfProducts >= 4 && numberOfTypesOfProducts < 8) {
            totalPrice *= 0.95;
        }
        if (numberOfTypesOfProducts >= 8 && numberOfTypesOfProducts < 12) {
            totalPrice *= 0.9;
        }
        if (numberOfTypesOfProducts >= 12) {
            totalPrice *= 0.75;
        }
        return totalPrice;
    }
}
