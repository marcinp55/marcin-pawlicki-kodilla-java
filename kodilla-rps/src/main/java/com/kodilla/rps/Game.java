package com.kodilla.rps;

import com.kodilla.rps.figures.Figure;
import com.kodilla.rps.figures.Paper;
import com.kodilla.rps.figures.Rock;
import com.kodilla.rps.figures.Scissors;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    static String playerName;
    static int playerOnePoints = 0;
    static int playerTwoPoints = 0;
    static int numberOfRoundsToPlay;
    private int currentRoundNumber = 1;
    private ArrayList<Round> rounds = new ArrayList<>();

    Scanner gameScanner = new Scanner(System.in);

    public String getPlayerName() {
        return playerName;
    }

    public int getNumberOfRoundsToPlay() {
        return numberOfRoundsToPlay;
    }

    public void beginGame() {
        playerOnePoints = 0;
        playerTwoPoints = 0;
        playerName = UserDialogs.getUserName();
        numberOfRoundsToPlay = UserDialogs.getNumberOfRounds();

        for (int i = 1;i <= numberOfRoundsToPlay;i++) {
            rounds.add(new Round(i));
        }

        UserDialogs.showInstructions();
        UserDialogs.showGameInfo();

        while (currentRoundNumber <= numberOfRoundsToPlay) {
            rounds.get(currentRoundNumber - 1).startRound();
            currentRoundNumber++;
        }

        UserDialogs.showResults();
    }

    public static void endGame() {
        System.out.println("Ending game...");
        System.exit(0);
    }

    //Returns 1 if player figure wins, 0 if there is a draw and -1 if player figure loses
    public static int compareFigures(Figure figure1, Figure figure2) {
        int result = 0;

        if (figure1.getWinsWith().equals(figure2.getName())) {
            result = 1;
        }
        if (figure1.getLosesWith().equals(figure2.getName())) {
            result = -1;
        }
        if (figure1.getName().equals(figure2.getName())) {
            result = 0;
        }
        return result;
    }

    public static Figure generateOpponentMove() {
        Random random = new Random();
        Figure figureToReturn = null;
        int randomNumber = random.nextInt(3) + 1;

        switch (randomNumber) {
            case 1: {
                figureToReturn = new Rock();
                break;
            }
            case 2: {
                figureToReturn = new Scissors();
                break;
            }
            case 3: {
                figureToReturn = new Paper();
                break;
            }
        }

        return figureToReturn;
    }
}
