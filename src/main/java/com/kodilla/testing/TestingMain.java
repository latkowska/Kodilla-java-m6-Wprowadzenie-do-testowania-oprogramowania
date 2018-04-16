package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculate1 = new Calculator();

        int addResult = calculate1.add(5, 3);

        if (addResult == 8) {
            System.out.println("Pierwszy test jednostkowy: Test ok!");
        } else {
            System.out.println("Pierwszy test jednostkowy: Error!");
        }

        Calculator calculate2 = new Calculator();

        int subtractResult = calculate2.subtract(6, 3);

        if (subtractResult == 2) {
            System.out.println("Drugi test jednostkowy: Test ok!");
        } else {
            System.out.println("Drugi test jednostkowy: Error!");
        }
    }
}

