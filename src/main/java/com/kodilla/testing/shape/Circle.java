package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private double r;

    public Circle(String shapeName, double r) {
        this.shapeName = shapeName;
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return r*r*Math.PI ;

    }
}
