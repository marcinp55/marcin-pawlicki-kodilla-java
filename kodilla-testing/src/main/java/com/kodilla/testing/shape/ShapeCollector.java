package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean status = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            status = true;
        }
        return status;
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public void showFigures() {
        System.out.println(figures);
    }
}
