package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.stores.Store;
import com.kodilla.good.patterns.food.suppliers.Supplier;

public class OrderProcessor {
    public OrderDto processOrder(Orderr orderr, Supplier supplier, Store store) {
        boolean isOrderSuccessful = OrderValidator.validate(orderr, store);

        orderr.setAmountToPay(supplier.process(orderr));

        return new OrderDto(supplier.getName(), orderr.getProductts(), orderr.getAmountToPay(), store.getName(),isOrderSuccessful);
    }
}
