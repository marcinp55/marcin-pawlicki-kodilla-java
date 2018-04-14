package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double lenght;
    private double height;

    public Triangle(double lenght, double height) {
        this.lenght = lenght;
        this.height = height;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (lenght * height) / 2;
    }
}
