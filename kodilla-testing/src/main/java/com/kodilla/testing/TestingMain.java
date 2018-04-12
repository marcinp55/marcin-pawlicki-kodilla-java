package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        //SimpleUser test

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test

        int a = 15;
        int b = 4;

        Calculator calc = new Calculator();
        int addResult = calc.add(a, b);
        int substResult = calc.substract(a, b);

        if (addResult == (a + b)) {
            System.out.println("Adding test OK");
        } else {
            System.out.println("Adding test failed.");
        }

        if (substResult == (a - b)) {
            System.out.println("Substract test OK");
        } else {
            System.out.println("Substract test failed.");
        }
    }
}