package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public interface OrderingService {
    MarketplaceUser getMarketplaceUser();
    ArrayList<Product> getProducts();
    double getAmountToPay();
    void addProduct(Product product);
}
