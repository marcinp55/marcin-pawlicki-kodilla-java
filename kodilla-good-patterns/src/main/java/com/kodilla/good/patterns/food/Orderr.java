package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.products.Productt;
import java.util.ArrayList;

public class Orderr {
    private ArrayList<Productt> productts;
    private double amountToPay = 0;

    public Orderr(ArrayList<Productt> productts) {
        this.productts = productts;
    }

    public ArrayList<Productt> getProductts() {
        return productts;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }
}