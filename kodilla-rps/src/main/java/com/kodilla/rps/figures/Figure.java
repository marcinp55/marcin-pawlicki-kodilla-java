package com.kodilla.rps.figures;

import java.util.ArrayList;

public interface Figure {
    ArrayList<String> getWinsWith();
    ArrayList<String> getLosesWith();
    String getName();
}
