package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterTestSuite {

    /**
    @Test
    public void testForumUsersQuantityZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.getUsersNames()).thenReturn(userNames);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int forumUsersQuantity = statisticsCounter.getForumUsersQuantity();
        //Then
        Assert.assertEquals(0, forumUsersQuantity);
    }

    @Test
    public void testForumUsersQuantityHundred() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        while(userNames.size()<100){
            userNames.add("ForumuUser");
        }
        when(statisticsMock.getUsersNames()).thenReturn(userNames);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int forumUsersQuantity = statisticsCounter.getForumUsersQuantity();
        //Then
        Assert.assertEquals(100, forumUsersQuantity);
    }


    @Test
    public void testPostsQuantityZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 0;
        when(statisticsMock.getPostsQuantity()).thenReturn(postsQuantity);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int forumPostsQuantity = statisticsCounter.getForumPostsQuantity();
        //Then
        Assert.assertEquals(0, forumPostsQuantity);
    }

    @Test
    public void testPostsQuantityThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 1000;
        when(statisticsMock.getPostsQuantity()).thenReturn(postsQuantity);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int forumPostsQuantity = statisticsCounter.getForumPostsQuantity();
        //Then
        Assert.assertEquals(1000, forumPostsQuantity);
    }

    @Test
    public void testCommentsQuantityZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsQuantity = 0;
        when(statisticsMock.getCommentsquantity()).thenReturn(commentsQuantity);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int forumCommentsQuantity = statisticsCounter.getForumCommentsQuantity();
        //Then
        Assert.assertEquals(0,forumCommentsQuantity);
    }

*/
    @Test
    //forumPostsQuantity = 2, forumUsersQuantity = 100
    public void testAveragePostsQuantityPerForumUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int forumPostsQuantity = 2;
        when(statisticsMock.getPostsQuantity()).thenReturn(forumPostsQuantity);

        List<String> userNames = new ArrayList<>();
        while(userNames.size()<100){
            userNames.add("ForumuUser");
        }
        when(statisticsMock.getUsersNames()).thenReturn(userNames);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        int forumUsersQuantity = statisticsCounter.getForumUsersQuantity();
        //When
        long averagePostsQuantityPerForumUser = statisticsCounter.getAveragePostsQuantityPerForumUser();
        //Then
        Assert.assertEquals(0,averagePostsQuantityPerForumUser);
    }
    @Test
    //forumPostsQuantity = 0, forumUsersQuantity = 100
    public void testAveragePostsQuantityPerForumUserTwo() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int forumPostsQuantity = 0;
        when(statisticsMock.getPostsQuantity()).thenReturn(forumPostsQuantity);

        List<String> userNames = new ArrayList<>();
        when(statisticsMock.getUsersNames()).thenReturn(userNames);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        int forumUsersQuantity = statisticsCounter.getForumUsersQuantity();
        //When
        long averagePostsQuantityPerForumUser = statisticsCounter.getAveragePostsQuantityPerForumUser();
        //Then
        Assert.assertEquals(0,averagePostsQuantityPerForumUser);
    }
}


