package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class OrderDto {
    private MarketplaceUser marketplaceUser;
    private ArrayList<Product> products;
    private double amountToPay;
    private boolean isPaymentSuccessful;
    private boolean isSent;

    public OrderDto(MarketplaceUser marketplaceUser, ArrayList<Product> products, double amountToPay, boolean isPaymentSuccessful, boolean isSent) {
        this.marketplaceUser = marketplaceUser;
        this.products = products;
        this.amountToPay = amountToPay;
        this.isPaymentSuccessful = isPaymentSuccessful;
        this.isSent = isSent;
    }

    public MarketplaceUser getMarketplaceUser() {
        return marketplaceUser;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public boolean isPaymentSuccessful() {
        return isPaymentSuccessful;
    }

    public boolean isSent() {
        return isSent;
    }

    @Override
    public String toString() {
        return "Order details for user: " + marketplaceUser +
                "\n Ordered products: " + products +
                "\n Amount to pay: " + amountToPay +
                "\n Payment status: " + isPaymentSuccessful +
                "\n Sending status: " + isSent;
    }
}
