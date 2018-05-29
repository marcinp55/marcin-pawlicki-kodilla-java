package com.kodilla.patterns.prototype.orders;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void testShallowCopy() throws CloneNotSupportedException {
        Order order = new Order();

        order.getItemList().add(new OrderItem("Product1", 4));
        order.getItemList().add(new OrderItem("Product2", 10));
        order.getItemList().add(new OrderItem("Product3", 7));
        Order orderDeepCopy = order.deepCopy();

        Order orderCopy = order.shallowCopy();
        orderCopy.getItemList().add(new OrderItem("Product4", 12));

        System.out.println(order.getItemList().size());
        System.out.println(orderDeepCopy.getItemList().size());

    }
}