package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal numberOfPeople;

    public Country(BigDecimal numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getPeopleQuantity() {
        return this.numberOfPeople;
    }
}
