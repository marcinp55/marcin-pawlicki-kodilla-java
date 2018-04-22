package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private String playerName;
    private int numberOfRoundsToPlay;
    private int playerOnePoints = 0;
    private int playerTwoPoints = 0;
    private int currentRoundNumber = 1;
    private ArrayList<Round> rounds = new ArrayList<>();

    Scanner gameScanner = new Scanner(System.in);

    public int getPlayerOnePoints() {
        return playerOnePoints;
    }

    public int getPlayerTwoPoints() {
        return playerTwoPoints;
    }

    public void setPlayerOnePoints(int playerOnePoints) {
        this.playerOnePoints = playerOnePoints;
    }

    public void setPlayerTwoPoints(int playerTwoPoints) {
        this.playerTwoPoints = playerTwoPoints;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getNumberOfRoundsToPlay() {
        return numberOfRoundsToPlay;
    }

    public void beginGame() {
        System.out.println("Welcome to Rock-Paper-Scissors");

        System.out.println("What's your name?");
        playerName = gameScanner.next();

        System.out.println("How many round do you want to play?");
        numberOfRoundsToPlay = gameScanner.nextInt();

        for (int i = 1;i <= numberOfRoundsToPlay;i++) {
            rounds.add(new Round(i));
        }

        System.out.println("------------------------------");
        System.out.println("Instructions: ");
        System.out.println("Press 1 to use Rock");
        System.out.println("Press 2 to use Paper");
        System.out.println("Press 3 to use Scissors");
        System.out.println("Press X to end the game");
        System.out.println("Press N to start a new game");
        System.out.println("------------------------------");
        System.out.println("Name: " + playerName);
        System.out.println("Number of rounds to play: " + numberOfRoundsToPlay);
        System.out.println("------------------------------");

        while (currentRoundNumber <= numberOfRoundsToPlay) {
            rounds.get(currentRoundNumber - 1).startRound();
            currentRoundNumber++;
        }
    }

    public static void endGame() {
        System.out.println("Ending game...");
        System.exit(0);
    }
}
