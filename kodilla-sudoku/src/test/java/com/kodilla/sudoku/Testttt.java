package com.kodilla.sudoku;

import org.junit.Test;

public class Testttt {
    @Test
    public void addTest() {
        SudokuGame sudokuGame = new SudokuGame();
        System.out.println(sudokuGame.getSudokuBoard().getRows().get(1).getSudokuElements().get(1).getValue());
        sudokuGame.getSudokuBoard().getRows().get(1).getSudokuElements().get(1).setValue(5);
        System.out.println(sudokuGame.getSudokuBoard().getRows().get(1).getSudokuElements().get(1).getValue());
    }
}
