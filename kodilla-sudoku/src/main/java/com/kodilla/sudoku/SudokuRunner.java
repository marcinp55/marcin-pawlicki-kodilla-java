package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        boolean gameFinished = false;

        SudokuBoard board = new SudokuBoard();
        System.out.println(board);
        //As long as user wants to play, gets new games
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            //gameFinished = theGame.resolveSudoku();
        }
    }
}
