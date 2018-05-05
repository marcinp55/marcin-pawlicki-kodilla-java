package com.kodilla.good.patterns.challenges;

public class MarketplaceUser {
    private String firstName;
    private String lastName;
    private double cashBalance;

    public MarketplaceUser(String firstName, String lastName, double cashBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cashBalance = cashBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getCashBalance() {
        return cashBalance;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
