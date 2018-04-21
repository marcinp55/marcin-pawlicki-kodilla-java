package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class World {
    ArrayList<Continent> continents;

    public World() {
        this.continents = new ArrayList<>();
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal numberOfPeople = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return numberOfPeople;
    }
}
