package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuGame {
    private SudokuDataProcessor dataProcessor = new SudokuDataProcessor();
    private SudokuBoard sudokuBoard = new SudokuBoard();

    public void chooseNextAction(String input) {
        ArrayList<Integer> processedNumbers = dataProcessor.processNumberInput(input);

        if (processedNumbers.size() != 0) {
            addNumber(processedNumbers.get(0), processedNumbers.get(1), processedNumbers.get(2));
        }
    }
    public void addNumber(int column, int row, int number) {
        sudokuBoard.getRows().get(row).getSudokuElements().get(column).setValue(number);
        System.out.println(sudokuBoard);
    }

    public boolean resolveSudoku() {
        return false;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }
}
