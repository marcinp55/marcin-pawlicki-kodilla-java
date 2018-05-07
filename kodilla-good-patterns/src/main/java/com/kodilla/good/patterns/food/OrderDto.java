package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.products.Productt;

import java.util.ArrayList;

public class OrderDto {
    private String supplierName;
    private ArrayList<Productt> productts;
    private double amountToPay;
    private String storeName;
    private boolean isSuccessful;

    public OrderDto(final String supplierName, final ArrayList<Productt> productts, final double amountToPay, final String storeName, final boolean isSuccessful) {
        this.supplierName = supplierName;
        this.productts = productts;
        this.amountToPay = amountToPay;
        this.storeName = storeName;
        this.isSuccessful = isSuccessful;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public ArrayList<Productt> getProductts() {
        return productts;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public String getStoreName() {
        return storeName;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    @Override
    public String toString() {
        return "Order details:" +
                "\n Supplier: " + supplierName +
                "\n Products: " + productts +
                "\n Amount to pay: " + amountToPay +
                "\n Store: " + storeName +
                "\n Successful status: " + isSuccessful;
    }
}
