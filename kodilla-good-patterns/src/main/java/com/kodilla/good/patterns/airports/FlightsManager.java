package com.kodilla.good.patterns.airports;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightsManager {
    private HashMap<Airport, ArrayList<Flight>> routes;

    public FlightsManager(HashMap<Airport, ArrayList<Flight>> routes) {
        this.routes = routes;
    }

    public HashMap<Airport, ArrayList<Flight>> getRoutes() {
        return routes;
    }

    private void addAirport(Airport airport, ArrayList<Flight> flights) {
        routes.put(airport, flights);
    }

    public void addRouteWithoutChange(Airport airport, String arrivalAirport) {
        routes.get(airport).add(new Flight(airport.getLocation(), arrivalAirport));
    }

    public void addRouteWithChange(Airport airport, String changeAirport, String arrivalAirport) {
        routes.get(airport).add(new Flight(airport.getLocation(), changeAirport, arrivalAirport));
    }

    public void printAllRoutes() {
        routes.entrySet().stream()
                .forEach(System.out::println);
    }

    public void searchRoutesByDepartureAirport(Airport airport) {
        System.out.println("\nAvailable flights from: " + airport.getLocation());
        routes.entrySet().stream()
                .filter(entry -> entry.getKey().equals(airport))
                .forEach(System.out::println);
    }

    public void searchRoutesByArrivalAirport(Airport airport) {
        System.out.println("\nAvailable flights to: " + airport.getLocation() + "\n");

        routes.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .filter(value -> value.getArrivalAirport().equals(airport.getLocation()))
                .forEach(System.out::println);
    }

    public void searchRoutesWithChange(Airport changeAirport, Airport destinationAirport) {
        System.out.println("\nAvailable flights to " + destinationAirport.getLocation() + " through " + changeAirport.getLocation() + ":");

        routes.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .filter(value -> value.getChangeAirport().equals(changeAirport.getLocation()))
                .filter(value -> value.getArrivalAirport().equals(destinationAirport.getLocation()))
                .forEach(System.out::println);
    }
}