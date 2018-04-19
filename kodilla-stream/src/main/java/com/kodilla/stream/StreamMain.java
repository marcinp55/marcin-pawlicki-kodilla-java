package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\n --------Beautifier---------");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("\nAll letters uppercase: ");
        System.out.println(poemBeautifier.beautify("Ala ma kota, a kot ma ale", (textToBeautify) -> textToBeautify.toUpperCase()));
        System.out.println("\nABC at the beginning and end: ");
        System.out.println(poemBeautifier.beautify("Ala ma kota", (textToBeautify -> "ABC" + textToBeautify + "ABC")));
        System.out.println("\nFirst letter to uppercase: ");
        System.out.println(poemBeautifier.beautify("ala ma kota, a kot ma ale", (textToBeautify -> textToBeautify.substring(0, 1).toUpperCase() + textToBeautify.substring(1))));
        System.out.println("\nDot at the end: ");
        System.out.println(poemBeautifier.beautify("Ala ma kota, a kot ma ale", (textToBeautify -> textToBeautify + ".")));
    }
}
