package com.kodilla.rps;

import com.kodilla.rps.com.kodilla.rps.rounds.ClassicRound;
import com.kodilla.rps.com.kodilla.rps.rounds.ComplexModeRound;
import com.kodilla.rps.com.kodilla.rps.rounds.Round;
import com.kodilla.rps.com.kodilla.rps.rounds.UnfairRound;
import com.kodilla.rps.figures.*;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    static String playerName;
    public static int playerOnePoints = 0;
    public static int playerTwoPoints = 0;
    static int numberOfRoundsToPlay;
    private int currentRoundNumber = 1;
    private ArrayList<Round> rounds = new ArrayList<>();

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
        int gameMode = UserDialogs.getGameMode();
        numberOfRoundsToPlay = UserDialogs.getNumberOfRounds();

        switch (gameMode) {
            case 1: {
                for (int i = 1;i <= numberOfRoundsToPlay;i++) {
                    rounds.add(new ClassicRound(i));
                }
                UserDialogs.showInstructionsClassic();
                break;
            }
            case 2: {
                for (int i = 1;i <= numberOfRoundsToPlay;i++) {
                    rounds.add(new UnfairRound(i));
                }
                UserDialogs.showInstructionsUnfair();
                break;
            }
            case 3: {
                for (int i = 1;i <= numberOfRoundsToPlay;i++) {
                    rounds.add(new ComplexModeRound(i));
                }
                UserDialogs.showInstructionsComplex();
                break;
            }
        }

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

        if (figure1.getWinsWith().contains(figure2.getName())) {
            result = 1;
        }
        if (figure1.getLosesWith().contains(figure2.getName())) {
            result = -1;
        }
        if (figure1.getName().equals(figure2.getName())) {
            result = 0;
        }
        return result;
    }

    public static Figure generateClassicOpponentMove() {
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

    //25% for win, 75% for lose or draw
    public static Figure generateUnfairOpponentMove(Figure chosenFigure) {
        Random random = new Random();
        Figure figureToReturn = null;
        Figure playerFigure = chosenFigure;

        if (playerFigure.getClass().equals(Rock.class)) {
            int randomNumber = random.nextInt(5) + 1;
            switch (randomNumber) {
                case 1: {
                    figureToReturn = new Paper();
                    break;
                }
                case 2: {
                    figureToReturn = new Paper();
                    break;
                }
                case 3: {
                    figureToReturn = new Rock();
                    break;
                }
                case 4: {
                    figureToReturn = new Rock();
                    break;
                }
                case 5: {
                    figureToReturn = new Scissors();
                    break;
                }
            }
        }

        if (playerFigure.getClass().equals((Scissors.class))) {
            int randomNumber = random.nextInt(5) + 1;
            switch (randomNumber) {
                case 1: {
                    figureToReturn = new Rock();
                    break;
                }
                case 2: {
                    figureToReturn = new Rock();
                    break;
                }
                case 3: {
                    figureToReturn = new Scissors();
                    break;
                }
                case 4: {
                    figureToReturn = new Scissors();
                    break;
                }
                case 5: {
                    figureToReturn = new Paper();
                    break;
                }
            }
        }

        if (playerFigure.getClass().equals(Paper.class)) {
            int randomNumber = random.nextInt(5) + 1;
            switch (randomNumber) {
                case 1: {
                    figureToReturn = new Scissors();
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
                case 4: {
                    figureToReturn = new Paper();
                    break;
                }
                case 5: {
                    figureToReturn = new Rock();
                    break;
                }
            }
        }
        return figureToReturn;
    }

    public static Figure generateComplexOpponentMove() {
        Random random = new Random();
        Figure figureToReturn = null;
        int randomNumber = random.nextInt(5) + 1;

        switch (randomNumber) {
            case 1: {
                figureToReturn = new Lizard();
                break;
            }
            case 2: {
                figureToReturn = new Paper();
                break;
            }
            case 3: {
                figureToReturn = new Rock();
                break;
            }
            case 4: {
                figureToReturn = new Scissors();
                break;
            }
            case 5: {
                figureToReturn = new Spock();
                break;
            }
        }

        return figureToReturn;
    }

    public static void afterRound(int compareResult) {
        switch (compareResult) {
            case 1: {
                System.out.println("You won this round!");
                Game.playerOnePoints += 1;
                break;
            }
            case 0: {
                System.out.println("We have a draw");
                break;
            }
            case -1: {
                System.out.println("You lose this time");
                Game.playerTwoPoints += 1;
                break;
            }
        }
    }
}