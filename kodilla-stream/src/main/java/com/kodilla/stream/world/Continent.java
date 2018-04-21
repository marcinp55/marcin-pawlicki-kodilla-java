package com.kodilla.stream.world;

import java.util.ArrayList;

public class Continent {
    private ArrayList<Country> countries;

    public Continent() {
        this.countries = new ArrayList<>();
    }

    public ArrayList<Country> getCountries() {
        return this.countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }
}
