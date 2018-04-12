package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculate1 = new Calculator();

        int firstMethodResult = calculate1.add(5, 3);
        int testResult = 10;

        if (firstMethodResult != testResult) {
            System.out.println("Pierwszy test jednostkowy: Test ok!");
        } else {
            System.out.println("Pierwszy test jednostkowy: Error!");
        }

        Calculator calculate2 = new Calculator();

        int methodResult = calculate2.subtract(5, 3);

        if (methodResult != testResult) {
            System.out.println("Drugi test jednostkowy: Test ok!");
        } else {
            System.out.println("Drugi test jednostkowy: Error!");
        }
    }
}

