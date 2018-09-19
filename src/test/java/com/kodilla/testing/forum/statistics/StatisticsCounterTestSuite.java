package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterTestSuite {

    @Test(expected = ArithmeticException.class)
    //forumPostsQuantity = 0, forumUsersQuantity = 0
    public void testAveragePostsQuantityPerForumUserOne() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getPostsQuantity()).thenReturn(0);
        List<String> userNames = mock(List.class);
        when(userNames.size()).thenReturn(0);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averagePostsQuantityPerForumUser = statisticsCounter.getAveragePostsQuantityPerForumUser();
        //Then
        Assert.assertEquals(0, averagePostsQuantityPerForumUser);
    }

    @Test(expected = ArithmeticException.class)
    //forumPostsQuantity = 0, forumUsersQuantity = 100
    public void testAveragePostsQuantityPerForumUserTwo() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getPostsQuantity()).thenReturn(0);
        List<String> userNames = mock(List.class);
        when(userNames.size()).thenReturn(100);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averagePostsQuantityPerForumUser = statisticsCounter.getAveragePostsQuantityPerForumUser();
        //Then
        Assert.assertEquals(0, averagePostsQuantityPerForumUser);
    }

    @Test(expected = ArithmeticException.class)
    //forumPostsQuantity = 1000, forumUsersQuantity = 100
    public void testAveragePostsQuantityPerForumUserThree() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getPostsQuantity()).thenReturn(1000);
        List<String> userNames = mock(List.class);
        when(userNames.size()).thenReturn(100);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averagePostsQuantityPerForumUser = statisticsCounter.getAveragePostsQuantityPerForumUser();
        //Then
        Assert.assertEquals(10, averagePostsQuantityPerForumUser);
    }

    @Test(expected = ArithmeticException.class)
    //forumCommentsQuantity = 0, forumUsersQuantity = 0
    public void testAverageCommentsQuantityPerForumUserOne() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getCommentsquantity()).thenReturn(0);
        List<String> userNames = mock(List.class);
        when(userNames.size()).thenReturn(0);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averageCommentsQuantityPerForumUser = statisticsCounter.getAverageCommentsQuantityPerForumUser();
        //Then
        Assert.assertEquals(0, averageCommentsQuantityPerForumUser);
    }

    @Test(expected = ArithmeticException.class)
    //forumCommentsQuantity = 0, forumUsersQuantity = 100
    public void testAverageCommentsQuantityPerForumUserTwo() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getCommentsquantity()).thenReturn(0);
        List<String> userNames = mock(List.class);
        when(userNames.size()).thenReturn(100);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averageCommentsQuantityPerForumUser = statisticsCounter.getAverageCommentsQuantityPerForumUser();
        //Then
        Assert.assertEquals(0, averageCommentsQuantityPerForumUser);
    }

    @Test(expected = ArithmeticException.class)
    //forumCommentsQuantity = 0, forumPostsQuantity = 0
    public void testAverageCommentsQuantityPerPostOne() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getCommentsquantity()).thenReturn(0);
        when(statisticsMock.getPostsQuantity()).thenReturn(0);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averageCommentsQuantityPerPost = statisticsCounter.getAverageCommentsQuantityPerPost();
        //Then
        Assert.assertEquals(0, averageCommentsQuantityPerPost);
    }

    @Test(expected = ArithmeticException.class)
    //forumCommentsQuantity = 0, forumPostsQuantity = 1000
    public void testAverageCommentsQuantityPerPostTwo() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getCommentsquantity()).thenReturn(0);
        when(statisticsMock.getPostsQuantity()).thenReturn(1000);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averageCommentsQuantityPerPost = statisticsCounter.getAverageCommentsQuantityPerPost();
        //Then
        Assert.assertEquals(0, averageCommentsQuantityPerPost);
    }

    @Test (expected = ArithmeticException.class)
    //forumCommentsQuantity = 10000, forumPostsQuantity = 1000
    public void testAverageCommentsQuantityPerPostThree() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getCommentsquantity()).thenReturn(10000);
        when(statisticsMock.getPostsQuantity()).thenReturn(1000);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averageCommentsQuantityPerPost = statisticsCounter.getAverageCommentsQuantityPerPost();
        //Then
        Assert.assertEquals(10, averageCommentsQuantityPerPost);
    }

    @Test(expected = ArithmeticException.class)
    //forumCommentsQuantity = 50, forumPostsQuantity = 1000
    public void testAverageCommentsQuantityPerPostFour() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.getCommentsquantity()).thenReturn(50);
        when(statisticsMock.getPostsQuantity()).thenReturn(1000);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        long averageCommentsQuantityPerPost = statisticsCounter.getAverageCommentsQuantityPerPost();
        //Then
        Assert.assertEquals(0.05, averageCommentsQuantityPerPost);
    }
}


