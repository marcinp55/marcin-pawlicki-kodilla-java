package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;

import java.util.ArrayList;
import java.util.List;
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
    }
}
