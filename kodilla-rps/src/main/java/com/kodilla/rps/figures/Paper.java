package com.kodilla.rps.figures;

public class Paper implements Figure {
    private final String name = "Paper";
    private final String winsWith = "Rock";
    private final String losesWith = "Scissors";

    public String getWinsWith() {
        return winsWith;
    }

    public String getLosesWith() {
        return losesWith;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Paper";
    }
}
