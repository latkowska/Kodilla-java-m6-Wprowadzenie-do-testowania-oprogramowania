package com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<>();

    public Shape addFigure(Shape shape) {
        figures.add(shape);
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        figures.remove(shape);
        return true;
    }

    public Shape getFigure(int n) {
        Shape theFigure = figures.get(n);
        return theFigure;
    }


    public ArrayList<Shape> showFigures() {
        return figures;
    }
}





