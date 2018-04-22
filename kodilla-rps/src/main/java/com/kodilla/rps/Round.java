package com.kodilla.rps;

import java.util.Scanner;

public class Round {
    private int roundNumber;
    private boolean roundEnd = false;

    private Scanner roundScanner = new Scanner(System.in);

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void startRound() {
        System.out.println("Starting round #" + roundNumber);
        while (roundEnd != true) {
            System.out.println("Make your move...");
            String move = roundScanner.next();
            switch (move) {
                case "N": {
                    System.out.println("Are you sure you want to start a new game? Y/N");
                    String decision = roundScanner.next();

                    if (decision == "Y" || decision == "y") {
                        roundEnd = true;
                        Game game = new Game();
                        game.beginGame();
                    } else if (decision == "N" || decision == "n") {
                        continue;
                    } else {
                        System.out.println("Not a valid response");
                    }
                }
                case "X": {
                    System.out.println("Are you sure you want to exit? Y/N");
                    String decision = roundScanner.next();
                    if (decision == "Y" || decision == "y") {
                        roundEnd = true;
                        Game.endGame();
                    } else if (decision == "N" || decision == "n") {
                        continue;
                    } else {
                        System.out.println("Not a valid response");
                    }
                }
                case "1": {
                    System.out.println("You chose rock");
                    roundEnd = true;
                }
            }
        }
    }
}
