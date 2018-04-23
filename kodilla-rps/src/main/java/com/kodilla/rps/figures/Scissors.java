package com.kodilla.rps.figures;

import java.util.ArrayList;

public class Scissors implements Figure {
    private final String name = "Scissors";
    private final ArrayList<String> winsWith;
    private final ArrayList<String> losesWith;

    public Scissors() {
        winsWith = new ArrayList<>();
        losesWith = new ArrayList<>();

        winsWith.add("Paper");
        winsWith.add("Lizard");

        losesWith.add("Rock");
        losesWith.add("Spock");
    }

    @Override
    public ArrayList<String> getWinsWith() {
        return winsWith;
    }

    @Override
    public ArrayList<String> getLosesWith() {
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
