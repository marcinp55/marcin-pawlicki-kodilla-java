package com.kodilla.patterns.prototype.orders;

import com.kodilla.patterns.prototype.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Order extends Prototype<Order> {
    private List<OrderItem> itemList = new ArrayList<>();
    private Wrapper<OrderItem> myWrapper = new Wrapper<>(new OrderItem("Item", 1));

    boolean a = true;
    String s = "Wartość a wynosi " + ((a) ? "true" : "false");

    public List<OrderItem> getItemList() {
        return itemList;
    }

    public Order shallowCopy() throws CloneNotSupportedException {
        return (Order)this.clone();
    }

    public Order deepCopy() throws CloneNotSupportedException {
        Order orderCopy = (Order)this.clone();
        orderCopy.itemList = new ArrayList<>();
        for (OrderItem item : itemList) {
            orderCopy.getItemList().add(new OrderItem(item));
        }
        return orderCopy;
    }
}
