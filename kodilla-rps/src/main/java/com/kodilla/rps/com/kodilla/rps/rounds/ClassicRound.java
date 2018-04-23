package com.kodilla.rps.com.kodilla.rps.rounds;

import com.kodilla.rps.Game;
import com.kodilla.rps.figures.Figure;
import com.kodilla.rps.figures.Paper;
import com.kodilla.rps.figures.Rock;
import com.kodilla.rps.figures.Scissors;

import java.util.Scanner;

public class ClassicRound implements Round {
    private int roundNumber;
    private boolean roundEnd = false;
    private Figure playerOneFigure;
    private Figure playerTwoFigure;

    private Scanner roundScanner = new Scanner(System.in);

    public ClassicRound(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    @Override
    public void startRound() {
        System.out.println("------------------------------");
        System.out.println("Starting round #" + roundNumber);
        while (roundEnd != true) {
            System.out.println("Make your move...");
            String move = roundScanner.nextLine();
            switch (move.toUpperCase()) {
                case "N": {
                    System.out.println("Are you sure you want to start a new game? Y/N");
                    String decision = roundScanner.nextLine().toUpperCase();

                    if (decision.equals("Y")) {
                        roundEnd = true;
                        Game game = new Game();
                        game.beginGame();
                    } else if (decision.equals("N")) {
                        continue;
                    } else {
                        System.out.println("Not a valid response");
                    }
                    break;
                }
                case "X": {
                    System.out.println("Are you sure you want to exit? Y/N");
                    String decision = roundScanner.nextLine().toUpperCase();
                    if (decision.equals("Y")) {
                        roundEnd = true;
                        Game.endGame();
                    } else if (decision.equals("N")) {
                        continue;
                    } else {
                        System.out.println("Not a valid response");
                    }
                    break;
                }
                case "1": {
                    System.out.println("------------------------------");
                    System.out.println("You chose Rock");
                    playerOneFigure = new Rock();
                    playerTwoFigure = Game.generateUnfairOpponentMove(playerOneFigure);
                    System.out.println("Opponent chose " + playerTwoFigure);
                    int compareResult = Game.compareFigures(playerOneFigure, playerTwoFigure);

                    CheckRoundEnd(compareResult);

                    System.out.println("Player one points: " + Game.playerOnePoints);
                    System.out.println("Player two points: " + Game.playerTwoPoints);

                    roundEnd = true;
                    break;
                }
                case "2": {
                    System.out.println("------------------------------");
                    System.out.println("You chose Paper");
                    playerOneFigure = new Paper();
                    playerTwoFigure = Game.generateUnfairOpponentMove(playerOneFigure);
                    System.out.println("Opponent chose " + playerTwoFigure);
                    int compareResult = Game.compareFigures(playerOneFigure, playerTwoFigure);

                    CheckRoundEnd(compareResult);

                    System.out.println("Player one points: " + Game.playerOnePoints);
                    System.out.println("Player two points: " + Game.playerTwoPoints);

                    roundEnd = true;
                    break;
                }
                case "3": {
                    System.out.println("------------------------------");
                    System.out.println("You chose Scissors");
                    playerOneFigure = new Scissors();
                    playerTwoFigure = Game.generateUnfairOpponentMove(playerOneFigure);
                    System.out.println("Opponent chose " + playerTwoFigure);
                    int compareResult = Game.compareFigures(playerOneFigure, playerTwoFigure);

                    CheckRoundEnd(compareResult);

                    System.out.println("Player one points: " + Game.playerOnePoints);
                    System.out.println("Player two points: " + Game.playerTwoPoints);

                    roundEnd = true;
                    break;
                }
            }
        }
    }

    @Override
    public void CheckRoundEnd(int compareResult) {
        Game.afterRound(compareResult);
    }
}
