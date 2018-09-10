package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape circle = new Circle(5);
        //When
        figure.addFigure(circle);
        //Then
        Assert.assertEquals(circle, figure.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape triangle = new Triangle(2, 4);
        figure.addFigure(triangle);
        //When
        Boolean removeResult = figure.removeFigure(triangle);
        //Then
        Assert.assertTrue(removeResult);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape triangle = new Triangle(2, 4);
        Shape circle = new Circle(5);
        Shape square = new Square(6);
        figure.addFigure(triangle);
        figure.addFigure(circle);
        figure.addFigure(square);
        //When
        Shape getFigureResult = figure.getFigure(1);
        //Then
        Assert.assertEquals(circle, getFigureResult);
    }

    @Test
    public void testShowFigures() {
        //Given
        ArrayList<Shape> figures = new ArrayList<>();
        ShapeCollector figure = new ShapeCollector();
        Shape triangle = new Triangle(2, 4);
        Shape circle = new Circle(5);
        Shape square = new Square(6);
        figure.addFigure(triangle);
        figure.addFigure(circle);
        figure.addFigure(square);
        figures.add(triangle);
        figures.add(circle);
        figures.add(square);
        //When
        ArrayList<Shape> showFiguresResult = figure.showFigures();
        //Then
        Assert.assertEquals(figures, showFiguresResult);
    }
}
