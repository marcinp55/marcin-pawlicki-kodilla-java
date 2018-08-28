package com.kodilla.sudoku;

public class SudokuInformationProcessor {
    public void showChooseNextActionInformation() {
        System.out.println("Choose a number like 2,4,9 (where 2 is column, 4 is row and 9 is the number you choose) or type SUDOKU to resolve the game.");
    }

    public void showWrongInputInformation() {
        System.out.println("All numbers must be between 1 and 9 and in #,#,# format");
    }
}
