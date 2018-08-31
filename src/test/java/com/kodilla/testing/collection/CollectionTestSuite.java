package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> firtsResultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing: " + firtsResultList);
        //Then
        Assert.assertEquals(emptyList.toArray(), firtsResultList.toArray());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> allNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = Arrays.asList(2,4,6,8,10);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> secondResultList = oddNumbersExterminator.exterminate(allNumbers);
        System.out.println("Testing: " + secondResultList);
        //Then
        Assert.assertEquals(evenNumbers, secondResultList);
    }
}
