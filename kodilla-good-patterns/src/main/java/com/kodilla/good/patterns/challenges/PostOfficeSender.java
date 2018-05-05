package com.kodilla.good.patterns.challenges;

public class PostOfficeSender implements SendingService {
    private boolean sendingStatus = false;

    @Override
    public boolean getSendingStatus() {
        return sendingStatus;
    }

    @Override
    public boolean sendOrder(PaymentService paymentService) {
        if (paymentService.processPayment()) {
            sendingStatus = true;
        } else {
            sendingStatus = false;
        }
        return sendingStatus;
    }
}
