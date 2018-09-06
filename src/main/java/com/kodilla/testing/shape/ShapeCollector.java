package com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<Shape>();


    public void addFigure(Shape shape) {
        //do nothing
    }

    public boolean removeFigure(Shape shape) {
        return true; //for now
    }

    public Shape getFigure(int n) {
        return null; //returning null means that the operation was unsuccessful
    }

    public ArrayList<Shape> showFigures() {
        return figures;

    }


}





