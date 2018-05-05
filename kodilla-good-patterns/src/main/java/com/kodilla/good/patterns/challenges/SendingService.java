package com.kodilla.good.patterns.challenges;

public interface SendingService {
    boolean getSendingStatus();
    boolean sendOrder(PaymentService paymentService);
}
