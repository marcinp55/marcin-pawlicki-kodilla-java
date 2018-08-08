package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testExtraPepperMeatOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraPeppersOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraMeatOrderDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(23), cost);
    }

    @Test
    public void testExtraPepperMeatOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraPeppersOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraMeatOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza with tomato sauce and cheese + peppers + meat", description);
    }

    @Test
    public void testExtraCheesePepperMeatSpicyOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraPeppersOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraMeatOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraSpicyOrderDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(27), cost);
    }

    @Test
    public void testExtraCheesePepperMeatSpicyOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraPeppersOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraMeatOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraSpicyOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza with tomato sauce and cheese + extra cheese + peppers + meat + extra spices", description);
    }
}
