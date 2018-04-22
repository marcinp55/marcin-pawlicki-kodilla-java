package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock-Paper-Scissors");
        String s = "";
        while (true) {
            System.out.println("What's your name?");
            s = scanner.nextLine();
            if (s.length() < 2) {
                System.out.println("Wrong answer");
            } else {
                return s;
            }
        }
    }

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How many rounds do you want to play?");
            try {
                String s = scanner.nextLine();
                int n = Integer.parseInt(s);
                return n;
            } catch(Exception e) {
                System.out.println("Incorrect number");
            }
        }
    }

    public static void showInstructions() {
        System.out.println("------------------------------");
        System.out.println("Instructions: ");
        System.out.println("Press 1 to use Rock");
        System.out.println("Press 2 to use Paper");
        System.out.println("Press 3 to use Scissors");
        System.out.println("Press X to end the game");
        System.out.println("Press N to start a new game");
        System.out.println("------------------------------");
    }

    public static void showResults() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("End of the game.");
        System.out.println("Results: ");
        System.out.println(Game.playerName + " got " + Game.playerOnePoints + " points.");
        System.out.println("Player two got " + Game.playerTwoPoints + " points.");
        if (Game.playerOnePoints > Game.playerTwoPoints) {
            System.out.println(Game.playerName + " won the game!");
        }
        if (Game.playerOnePoints < Game.playerTwoPoints) {
            System.out.println("Player two won the game!");
        }
        if (Game.playerOnePoints == Game.playerTwoPoints) {
            System.out.println("The game ended with a draw!");
        }

        System.out.println("------------------------------");
        System.out.println("Do you want to play again? Y/N");
        String s = scanner.nextLine();
        if (s.toUpperCase().equals("Y")) {
            System.out.println("Starting new game...");
            Game game = new Game();
            game.beginGame();
        } else if (s.toUpperCase().equals("N")) {
            Game.endGame();
        }
    }

    public static void showGameInfo() {
        System.out.println("Name: " + Game.playerName);
        System.out.println("Number of rounds to play: " + Game.numberOfRoundsToPlay);
    }
}
