package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {
    private ArrayList<SudokuElement> sudokuElements;

    public SudokuRow() {
        this.sudokuElements = new ArrayList<>();
        for (int i = 1;i <= 9;i++) {
            this.sudokuElements.add(new SudokuElement());
        }
    }

    public ArrayList<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }
}
