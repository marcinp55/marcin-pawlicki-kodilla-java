package com.kodilla.testing.shape;

public class Square implements Shape {
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return lenght * lenght;
    }
}
