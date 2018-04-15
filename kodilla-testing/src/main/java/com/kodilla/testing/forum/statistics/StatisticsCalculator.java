package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculator {
    Statistics statistics;
    private double avgPostPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() != 0) {
            avgPostPerUser = statistics.postsCount() / statistics.usersNames().size();
            avgCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.postsCount() != 0) {
            avgCommentsPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
        }
    }

    public void showStatistics() {
        System.out.println("Forum statistics: ");
        System.out.println("Number of users: " + statistics.usersNames().size());
        System.out.println("Number of posts: " + statistics.postsCount());
        System.out.println("Number of comments: " + statistics.commentsCount());
        System.out.println("Average post per user: " + avgPostPerUser);
        System.out.println("Average comments per user: " + avgCommentsPerUser);
        System.out.println("Average comments per post: " + avgCommentsPerPost);
    }
}
