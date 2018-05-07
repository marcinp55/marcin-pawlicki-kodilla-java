package com.kodilla.good.patterns;

import com.kodilla.good.patterns.airports.Airport;
import com.kodilla.good.patterns.airports.Flight;
import com.kodilla.good.patterns.airports.FlightsManager;
import com.kodilla.good.patterns.challenges.*;
import com.kodilla.good.patterns.food.OrderProcessor;
import com.kodilla.good.patterns.food.Orderr;
import com.kodilla.good.patterns.food.products.Apple;
import com.kodilla.good.patterns.food.products.Banana;
import com.kodilla.good.patterns.food.products.Orange;
import com.kodilla.good.patterns.food.products.Productt;
import com.kodilla.good.patterns.food.stores.Auchan;
import com.kodilla.good.patterns.food.stores.Netto;
import com.kodilla.good.patterns.food.stores.Store;
import com.kodilla.good.patterns.food.stores.Tesco;
import com.kodilla.good.patterns.food.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.food.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.food.suppliers.HealthyShop;
import com.kodilla.good.patterns.food.suppliers.Supplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class GoodPaternsMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movieList = movieStore.getMovies().entrySet().stream()
                .flatMap(set -> set.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieList);

        //9.2
        System.out.println("\n///////////////////////////////////////////\n");

        MarketplaceUser marketplaceUser1 = new MarketplaceUser("John", "Johnson", 500);
        OrderingService order1 = new Order(marketplaceUser1);
        Product product1 = new Table("Wooden table", 50, 2);
        Product product2 = new Table("Glass table", 85, 3);
        order1.addProduct(product1);
        order1.addProduct(product2);
        PaymentService paymentService1 = new CardPayment(12345, order1.getAmountToPay(), marketplaceUser1);
        SendingService sendingService1 = new PostOfficeSender();

        ProductOrderService productOrderService = new ProductOrderService(order1, paymentService1, sendingService1);
        System.out.println(productOrderService.process());

        //9.3
        System.out.println("\n///////////////////////////////////////////\n");

        ArrayList<Productt> productts = new ArrayList<>();
        Productt productt1 = new Apple(10);
        Productt productt2 = new Banana(15);
        Productt productt3 = new Orange(5);
        productts.add(productt1);
        productts.add(productt2);
        productts.add(productt3);

        Supplier supplier1 = new ExtraFoodShop();
        Supplier supplier2 = new GlutenFreeShop();
        Supplier supplier3 = new HealthyShop();

        Store store1 = new Auchan();
        Store store2 = new Netto();
        Store store3 = new Tesco();

        Orderr orderr = new Orderr(productts);

        OrderProcessor orderProcessor = new OrderProcessor();

        System.out.println(orderProcessor.processOrder(orderr, supplier1, store1));

        //9.4
        System.out.println("\n///////////////////////////////////////////\n");

        Airport airport1 = new Airport("Poznan");
        Airport airport2 = new Airport("Wroclaw");
        Airport airport3 = new Airport("Warszawa");
        Airport airport4 = new Airport("Katowice");

        Flight flight1 = new Flight("Poznan", "Warszawa");
        Flight flight2 = new Flight("Wroclaw", "Poznan");
        Flight flight3 = new Flight("Katowice", "Wroclaw");
        Flight flight4 = new Flight("Warszawa", "Katowice");
        Flight flight5 = new Flight("Warszawa", "Poznan", "Katowice");
        Flight flight6 = new Flight("Wroclaw", "Poznan", "Katowice");
        Flight flight7 = new Flight("Poznan", "Katowice", "Warszawa");
        Flight flight8 = new Flight("Katowice", "Wroclaw", "Warszawa");

        ArrayList<Flight> flightsPoznan = new ArrayList<>();
        ArrayList<Flight> flightsWroclaw = new ArrayList<>();
        ArrayList<Flight> flightsWarszawa = new ArrayList<>();
        ArrayList<Flight> flightsKatowice = new ArrayList<>();

        flightsPoznan.add(flight1);
        flightsPoznan.add(flight7);
        flightsWroclaw.add(flight2);
        flightsWroclaw.add(flight6);
        flightsWarszawa.add(flight4);
        flightsWarszawa.add(flight5);
        flightsKatowice.add(flight3);
        flightsKatowice.add(flight8);

        HashMap<Airport, ArrayList<Flight>> routes = new HashMap<>();
        routes.put(airport1, flightsPoznan);
        routes.put(airport2, flightsWroclaw);
        routes.put(airport3, flightsWarszawa);
        routes.put(airport4, flightsKatowice);

        FlightsManager flightsManager = new FlightsManager(routes);

        //Searching for flights from city
        flightsManager.searchRoutesByDepartureAirport(airport1);

        //Searching for flight to city
        flightsManager.searchRoutesByArrivalAirport(airport2);

        //Searching for flight with change to chosen city
        flightsManager.searchRoutesWithChange(airport1, airport4);
    }
}
