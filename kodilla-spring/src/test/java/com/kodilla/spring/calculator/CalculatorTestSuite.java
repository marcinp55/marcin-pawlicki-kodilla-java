package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);

        double added = calculator.add(2, 4);
        double substracted = calculator.sub(8, 3);
        double multiplied = calculator.mul(2, 5);
        double divided = calculator.div(10, 5);

        Assert.assertEquals(6, added, 0.001);
        Assert.assertEquals(5, substracted, 0.001);
        Assert.assertEquals(10, multiplied, 0.001);
        Assert.assertEquals(2, divided, 0.001);
    }
}
