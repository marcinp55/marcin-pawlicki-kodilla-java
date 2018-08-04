package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuElement {
    private int value;
    public static int EMPTY = -1;
    private ArrayList<Integer> availableValues;

    public SudokuElement() {
        this.value = EMPTY;
        this.availableValues = new ArrayList<>();
        for (int i = 1;i<=9;i++) {
            this.availableValues.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public ArrayList<Integer> getAvailableValues() {
        return availableValues;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
