package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) {
        SudokuInformationProcessor sudokuInfo = new SudokuInformationProcessor();
        boolean gameFinished = false;
        SudokuGame theGame = new SudokuGame();

        //As long as user wants to play, gets new games
        while (!gameFinished) {
            sudokuInfo.showChooseNextActionInformation();

            Scanner scanner = new Scanner(System.in);
            String chosenOption = scanner.nextLine();

            if (chosenOption.equals("SUDOKU")) {
                gameFinished = theGame.resolveSudoku();
            } else {
                theGame.chooseNextAction(chosenOption);
            }
        }
    }
}
