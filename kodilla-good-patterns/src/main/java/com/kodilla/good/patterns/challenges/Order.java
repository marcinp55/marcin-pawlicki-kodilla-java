package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class Order implements OrderingService{
    private MarketplaceUser marketplaceUser;
    private ArrayList<Product> products;
    private double amountToPay;
    private AmountCalculator amountCalculator = new AmountCalculator();

    public Order(MarketplaceUser marketplaceUser) {
        this.marketplaceUser = marketplaceUser;
        this.products = new ArrayList<Product>();
        this.amountToPay = 0;
    }

    public Order(MarketplaceUser marketplaceUser, ArrayList<Product> products) {
        this.marketplaceUser = marketplaceUser;
        this.products = products;
        this.amountToPay = amountCalculator.calculateAmount(products);
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

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
        this.amountToPay = amountCalculator.calculateAmount(products);
    }
}
