package com.kodilla.good.patterns.challenges;

public class CardPayment implements PaymentService {
    private int cardNumber;
    private double amountToPay;
    private boolean paymentSuccessful;
    private MarketplaceUser marketplaceUser;

    public CardPayment(int cardNumber, double amountToPay, MarketplaceUser marketplaceUser) {
        this.cardNumber = cardNumber;
        this.amountToPay = amountToPay;
        this.paymentSuccessful = false;
        this.marketplaceUser = marketplaceUser;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }

    public MarketplaceUser getMarketplaceUser() {
        return marketplaceUser;
    }

    @Override
    public boolean processPayment() {
        CashBalanceValidator validator = new CashBalanceValidator();
        if (validator.checkCashBalance(marketplaceUser.getCashBalance(), amountToPay)) {
            //System.out.println("Payment of " + amountToPay + " successful from card number: " + cardNumber);
            return true;
        }
        //System.out.println("Payment unsuccessful, insufficient amount of money on card number: " + cardNumber);
        return false;
    }
}
