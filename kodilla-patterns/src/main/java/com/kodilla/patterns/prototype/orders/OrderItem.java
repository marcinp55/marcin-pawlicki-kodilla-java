package com.kodilla.patterns.prototype.orders;

public class OrderItem {
    private String productName;
    private int quantity;

    public OrderItem(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public OrderItem(OrderItem item) {
        this.productName = item.productName;
        this.quantity = item.quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
