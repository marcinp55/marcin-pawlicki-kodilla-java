package com.kodilla.good.patterns.food.suppliers;

import com.kodilla.good.patterns.food.Orderr;

public interface Supplier {
    double process(Orderr orderr);
    String getName();
}
