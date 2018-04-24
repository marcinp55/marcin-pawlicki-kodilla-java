package com.kodilla.exception.test;

public class ExceptionHandling {
    SecondChallenge secondChallenge = new SecondChallenge();

    String s;

    {
        try {
            s = secondChallenge.probablyIWillThrowException(1, 2);
        } catch (Exception e) {
            System.out.println("Method error.");
        } finally {
            System.out.println("Adding to log.");
        }
    }

}
