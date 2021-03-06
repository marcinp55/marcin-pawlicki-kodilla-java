package com.kodilla.rps.figures;

import java.util.ArrayList;

public class Paper implements Figure {
    private final String name = "Paper";
    private final ArrayList<String> winsWith;
    private final ArrayList<String> losesWith;

    public Paper() {
        winsWith = new ArrayList<>();
        losesWith = new ArrayList<>();

        winsWith.add("Rock");
        winsWith.add("Spock");

        losesWith.add("Scissors");
        losesWith.add("Lizard");
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
        return "Paper";
    }
}
