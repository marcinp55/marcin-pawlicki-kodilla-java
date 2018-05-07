package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.stores.Store;

public class OrderValidator {
    public static boolean validate(Orderr orderr, Store store) {
        if (orderr.getAmountToPay() <= store.getMoneyBalance()) {
            return true;
        }
        return false;
    }
}
