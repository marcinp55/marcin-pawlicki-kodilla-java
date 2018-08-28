package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuBoard {
    private ArrayList<SudokuRow> rows;

    public SudokuBoard() {
        this.rows = new ArrayList<>();
        for (int i = 1;i <= 9;i++) {
            rows.add(new SudokuRow());
        }
    }

    public ArrayList<SudokuRow> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        String board = "";

        for (int i = 0;i <= 8;i++) {
            board += " ---- ---- ---- ---- ---- ---- ---- ---- ---- \n";
            board += "| ";

            for (int j = 0;j <= 8;j++) {
                board += rows.get(j).getSudokuElements().get(j).getValue() + " | ";
            }
            board += "\n";
        }

        board += " ---- ---- ---- ---- ---- ---- ---- ---- ---- \n";

        return board;
    }
}
