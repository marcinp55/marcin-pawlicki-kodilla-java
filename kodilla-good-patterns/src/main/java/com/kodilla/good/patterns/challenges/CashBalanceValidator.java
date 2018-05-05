package com.kodilla.good.patterns.challenges;

public class CashBalanceValidator {
    public boolean checkCashBalance(double amountOwned, double amountToPay) {
        if (amountToPay <= amountOwned) {
            return true;
        }
        return false;
    }
}
