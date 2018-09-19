package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;


public class StatisticsCounter {

    Statistics statistics; //obiekty brakującej klasy, nie interfejsu o tej samej nazwie

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    int forumPostsQuantity;
    int forumUsersQuantity;
    int forumCommentsQuantity;

    public int getForumUsersQuantity() {
        List<String> userNames = statistics.getUsersNames();
        int forumUsersQuantity = userNames.size();
        return forumUsersQuantity;
    }

    public int getForumPostsQuantity() {
        int forumPostsQuantity = statistics.getPostsQuantity();
        return forumPostsQuantity;
    }

    public int getForumCommentsQuantity() {
        int forumCommentsQuantity = statistics.getCommentsquantity();
        return forumCommentsQuantity;
    }


    public double getAveragePostsQuantityPerForumUser() {
        double averagePostsQuantityPerForumUser = forumPostsQuantity / forumUsersQuantity;
        return averagePostsQuantityPerForumUser;
    }

    public double getAverageCommentsQuantityPerForumUser() {
        double averageCommentsQuantityPerForumUser = forumCommentsQuantity / forumUsersQuantity;
        return averageCommentsQuantityPerForumUser;
    }

    public double getAverageCommentsQuantityPerPost() {
        double averageCommentsQuantityPerPost = forumCommentsQuantity / forumPostsQuantity;
        return averageCommentsQuantityPerPost;
    }


    /**
    public void showStatistics() {
        System.out.println("Forum users quantity: " + forumUsersQuantity + ", / "
                + "Posts quantity: " + forumPostsQuantity + ", / "
                + "Comments quantity: " + forumCommentsQuantity + ", / "
                + "Average Posts Quantity Per Forum User: " + averagePostsQuantityPerForumUser + ", / "
                + "Average Comments Quantity Per Forum User: " + averageCommentsQuantityPerForumUser + ", / "
                + "Average Comments Quantity Per Post: " + averageCommentsQuantityPerPost);
    }
*/
}
