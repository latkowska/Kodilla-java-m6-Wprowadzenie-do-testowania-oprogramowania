package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;


public class StatisticsCounter {

    Statistics statistics; //obiekty brakującej klasy, nie interfejsu o tej samej nazwie
    public int forumUsersQuantity;
    public int forumPostsQuantity;
    public int forumCommentsQuantity;
    public long averagePostsQuantityPerForumUser;
    public long averageCommentsQuantityPerForumUser;
    public long averageCommentsQuantityPerPost;


    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getForumUsersQuantity() {
        List<String> userNames = statistics.getUsersNames();
        forumUsersQuantity = userNames.size();
        return forumUsersQuantity;
    }

    public int getForumPostsQuantity() {
        forumPostsQuantity = statistics.getPostsQuantity();
        return forumPostsQuantity;
    }

    public int getForumCommentsQuantity() {
        forumCommentsQuantity = statistics.getCommentsquantity();
        return forumCommentsQuantity;
    }


    public long getAveragePostsQuantityPerForumUser() {
        averagePostsQuantityPerForumUser = forumPostsQuantity / forumUsersQuantity;
        return averagePostsQuantityPerForumUser;
    }

    public long getAverageCommentsQuantityPerForumUser(Statistics statistics) {
        averageCommentsQuantityPerForumUser = forumCommentsQuantity / forumUsersQuantity;
        return averageCommentsQuantityPerForumUser;
    }

    public long getAverageCommentsQuantityPerPost(Statistics statistics) {
        averageCommentsQuantityPerPost = forumCommentsQuantity / forumPostsQuantity;
        return averageCommentsQuantityPerPost;
    }


    public void showStatistics() {//wyświtla zapamiętane statystyki
        System.out.println("Forum users quantity: " + forumUsersQuantity + ", / "
                + "Posts quantity: " + forumPostsQuantity + ", / "
                + "Comments quantity: " + forumCommentsQuantity + ", / "
                + "Average Posts Quantity Per Forum User: " + averagePostsQuantityPerForumUser + ", / "
                + "Average Comments Quantity Per Forum User: " + averageCommentsQuantityPerForumUser + ", / "
                + "Average Comments Quantity Per Post: " + averageCommentsQuantityPerPost);
    }

}
