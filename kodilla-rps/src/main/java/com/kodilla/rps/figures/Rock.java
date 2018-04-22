package com.kodilla.rps.figures;

public class Rock implements Figure {
    private final String name = "Rock";
    private final String winsWith = "Scissors";
    private final String losesWith = "Paper";

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
        return "Rock";
    }
}
