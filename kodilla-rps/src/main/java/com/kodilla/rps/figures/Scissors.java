package com.kodilla.rps.figures;

public class Scissors implements Figure {
    private final String name = "Scissors";
    private final String winsWith = "Paper";
    private final String losesWith = "Rock";

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
        return "Scissors";
    }
}
