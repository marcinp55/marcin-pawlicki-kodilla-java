package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuDataProcessor {
    private SudokuInformationProcessor sudokuInfo = new SudokuInformationProcessor();

    public ArrayList<Integer> processNumberInput(String input) {
        ArrayList<Integer> processedNumbers = new ArrayList<>();

        if (input.length() == 5) {
            int column = Integer.parseInt(input.substring(0, 1));
            int row = Integer.parseInt(input.substring(2, 3));
            int number = Integer.parseInt(input.substring(4, 5));

            if (column >= 1 && column <= 9 && row >= 1 && row <= 9 && number >= 1 && number <= 9 && input.substring(1, 2).equals(",") && input.substring(3, 4).equals(",")) {
                processedNumbers.add(column);
                processedNumbers.add(row);
                processedNumbers.add(number);
            } else {
                sudokuInfo.showWrongInputInformation();
            }
        } else {
            sudokuInfo.showWrongInputInformation();
        }

        return processedNumbers;
    }
}
