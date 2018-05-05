package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrderingService orderingService;
    private PaymentService paymentService;
    private SendingService sendingService;

    public ProductOrderService(final OrderingService orderingService, final PaymentService paymentService, final SendingService sendingService) {
        this.orderingService = orderingService;
        this.paymentService = paymentService;
        this.sendingService = sendingService;
    }

    public OrderDto process() {
        if (sendingService.sendOrder(paymentService)) {
            return new OrderDto(orderingService.getMarketplaceUser(), orderingService.getProducts(), orderingService.getAmountToPay(), paymentService.processPayment(), true);
        }
        return new OrderDto(orderingService.getMarketplaceUser(), orderingService.getProducts(), orderingService.getAmountToPay(), paymentService.processPayment(), false);
    }
}
