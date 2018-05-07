package com.kodilla.good.patterns.airports;

import java.util.Objects;

public class Flight {
    private String startingAirport;
    private String changeAirport;
    private String arrivalAirport;

    public Flight(String startingAirport, String arrivalAirport) {
        this.startingAirport = startingAirport;
        this.arrivalAirport = arrivalAirport;
        this.changeAirport = "Empty";
    }

    public Flight(String startingAirport, String changeAirport, String arrivalAirport) {
        this.startingAirport = startingAirport;
        this.changeAirport = changeAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getStartingAirport() {
        return startingAirport;
    }

    public String getChangeAirport() {
        return changeAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(startingAirport, flight.startingAirport) &&
                Objects.equals(changeAirport, flight.changeAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public String toString() {
        if (changeAirport.equals("Empty")) {
            return "  (Departure: " + startingAirport + ", arrival: " + arrivalAirport + ")";
        }
        return "\n  (Departure: " + startingAirport + ", changing: " + changeAirport + ", arrival: " + arrivalAirport + ")";
    }
}
