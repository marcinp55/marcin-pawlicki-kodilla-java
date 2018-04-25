package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();

        flights.put("Warsaw", true);
        flights.put("Poznan", true);
        flights.put("Krakow", false);
        flights.put("Wroclaw", false);
        flights.put("Gdansk", true);
        flights.put("Katowice", false);

        if (flights.containsKey(flight.getArrivalAirport())) {
            if (flights.get(flight.getArrivalAirport())) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new RouteNotFoundException();
        }
    }
}
