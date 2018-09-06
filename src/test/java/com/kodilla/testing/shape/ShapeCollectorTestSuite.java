package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import com.kodilla.testing.shape.ShapeCollector;

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
        List<Shape> figures = new ArrayList<>();
        Shape circle = new Circle("Circle", 5);
        //When
        figures.addFigure(circle);
        //Then
        Assert.assertEquals(1, figures.size());


    }

    @Test
    public void testRemoveFigure() {
    }


    @Test
    public void testGetFigure() {
        //Given
        List<Figure> figures = new ArrayList<>();
        figures.add(new Figure("Circle", 25));
        figures.add(new Figure("Triangle", 20));
        figures.add(new Figure("Square", 20));
        //When
        Figure getFigureResult = figures.get(2);
        //Then
        Assert.assertEquals(new Figure("Square", 20), getFigureResult);
    }

    @Test
    public void testShowFigures() {
        //Given
        List<Figure> figures = new ArrayList<>();
        figures.add(new Figure("Circle", 25));
        figures.add(new Figure("Triangle", 20));
        figures.add(new Figure("Square", 20));
        //When
        Figure showFiguresResult = figures.showFigures();
        //Then
        Assert.assertEquals(figures, showFiguresResult);
    }
}
