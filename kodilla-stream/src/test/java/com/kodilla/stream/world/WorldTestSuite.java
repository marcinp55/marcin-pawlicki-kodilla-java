package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent africa = new Continent();
        Continent asia = new Continent();
        Continent europe = new Continent();

        //Europe
        Country poland = new Country(new BigDecimal("38476269"));
        Country germany = new Country(new BigDecimal("80594017"));
        Country france = new Country(new BigDecimal("67106161"));
        Country slovakia = new Country(new BigDecimal("5445829"));

        //Asia
        Country china = new Country(new BigDecimal("1379302771"));
        Country india = new Country(new BigDecimal("1281935911"));
        Country russia = new Country(new BigDecimal("142257519"));
        Country kazakhstan = new Country(new BigDecimal("18556698"));

        //Africa
        Country nigeria = new Country(new BigDecimal("190632261"));
        Country egypt = new Country(new BigDecimal("97041072"));
        Country ethiopia = new Country(new BigDecimal("105350020"));
        Country ghana = new Country(new BigDecimal("27499924"));

        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        africa.addCountry(ethiopia);
        africa.addCountry(ghana);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(slovakia);

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(russia);
        asia.addCountry(kazakhstan);

        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

        BigDecimal numberOfPeople = world.getPeopleQuantity();
        BigDecimal expectedNumberOfPeople = new BigDecimal("3434198452");

        Assert.assertEquals(expectedNumberOfPeople, numberOfPeople);
    }
}
