package com.kodilla.good.patterns;

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
    }
}
