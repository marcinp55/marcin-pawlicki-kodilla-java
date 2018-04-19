package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String textToBeautify, PoemDecorator poemDecorator) {
        String modifiedText = poemDecorator.decorate(textToBeautify);
        return modifiedText;
    }
}
