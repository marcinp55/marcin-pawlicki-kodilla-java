package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("Normal")
                .burgers(3)
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Bacon")
                .ingredient("Cheese")
                .build();
        //When
        //Then
        Assert.assertEquals("Normal", bigmac.getBun());
        Assert.assertTrue(bigmac.getIngredients().contains("Onion"));
        Assert.assertEquals(3, bigmac.getBurgers());
        System.out.println(bigmac);
    }
}
