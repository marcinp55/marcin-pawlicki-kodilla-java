package com.kodilla.good.patterns.airports;

import java.util.Objects;

public class Airport {
    private String location;

    public Airport(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public int hashCode() {
        if (location.length() <= 4) {
            return 1;
        }
        if (location.length() == 5) {
            return 2;
        }
        if (location.length() == 6) {
            return 3;
        }
        if (location.length() == 7) {
            return 4;
        }
        if (location.length() == 8) {
            return 5;
        }
        return 0;
    }

    @Override
    public String toString() {
        return location + " airport";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(location, airport.location);
    }
}
