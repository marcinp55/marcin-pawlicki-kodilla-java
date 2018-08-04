package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {
    private ArrayList<SudokuElement> row;

    public SudokuRow() {
        this.row = new ArrayList<>();
        for (int i = 1;i <= 9;i++) {
            this.row.add(new SudokuElement());
        }
    }

    public ArrayList<SudokuElement> getRow() {
        return row;
    }
}
