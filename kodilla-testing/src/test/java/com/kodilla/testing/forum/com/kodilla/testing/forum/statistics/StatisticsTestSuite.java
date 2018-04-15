package com.kodilla.testing.forum.com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting statistics test suite.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Statistics test suite finished.");
    }

    @Before
    public void beforeCase() {
        System.out.println("Starting case.");
    }

    @After
    public void afterCase() {
        System.out.println("Case finished.");
    }

    @Test
    public void testCalculateAdvStatisticsWithMock() {
        //Given
        Statistics statisticsMock1 = mock(Statistics.class);
        Statistics statisticsMock2 = mock(Statistics.class);
        Statistics statisticsMock3 = mock(Statistics.class);

        //0 users
        List<String> userNames1 = new ArrayList<>();
        //100 users
        List<String> userNames2 = new ArrayList<>();
        for (int i = 1;i < 101;i++) {
            userNames2.add("John" + 1);
        }

        //Posts
        int postsCount1 = 0;
        int postsCount2 = 1000;

        //Comments
        int commentsCount1 = 0;
        int commentsCount2 = 500;
        int commentsCount3 = 1500;

        StatisticsCalculator calculator1 = new StatisticsCalculator(statisticsMock1);
        StatisticsCalculator calculator2 = new StatisticsCalculator(statisticsMock2);
        StatisticsCalculator calculator3 = new StatisticsCalculator(statisticsMock3);

        when(statisticsMock1.usersNames()).thenReturn(userNames1);
        when(statisticsMock1.postsCount()).thenReturn(postsCount1);
        when(statisticsMock1.commentsCount()).thenReturn(commentsCount1);

        when(statisticsMock2.usersNames()).thenReturn(userNames2);
        when(statisticsMock2.postsCount()).thenReturn(postsCount2);
        when(statisticsMock2.commentsCount()).thenReturn(commentsCount2);

        when(statisticsMock3.usersNames()).thenReturn(userNames2);
        when(statisticsMock3.postsCount()).thenReturn(postsCount2);
        when(statisticsMock3.commentsCount()).thenReturn(commentsCount3);

        //When
        calculator1.calculateAdvStatistics(statisticsMock1);
        calculator2.calculateAdvStatistics(statisticsMock2);
        calculator3.calculateAdvStatistics(statisticsMock3);

        double postPerUser2 = (double)postsCount2 / (double)userNames2.size();
        double commentsPerUser2 = (double)commentsCount2 / (double)userNames2.size();
        double commentsPerPost2 = (double)commentsCount2 / (double)postsCount2;

        double postPerUser3 = (double)postsCount2 / (double)userNames2.size();
        double commentsPerUser3 = (double)commentsCount3 / (double)userNames2.size();
        double commentsPerPost3 = (double)commentsCount3 / (double)postsCount2;

        //Then
        Assert.assertEquals(0.0, calculator1.getAvgPostPerUser(), 0.001);
        Assert.assertEquals(0.0, calculator1.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(0.0, calculator1.getAvgCommentsPerPost(), 0.001);

        Assert.assertEquals(postPerUser2, calculator2.getAvgPostPerUser(), 0.001);
        Assert.assertEquals(commentsPerUser2, calculator2.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(commentsPerPost2, calculator2.getAvgCommentsPerPost(), 0.001);

        Assert.assertEquals(postPerUser3, calculator3.getAvgPostPerUser(), 0.001);
        Assert.assertEquals(commentsPerUser3, calculator3.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(commentsPerPost3, calculator3.getAvgCommentsPerPost(), 0.001);

        System.out.println("---------------------");
        calculator1.showStatistics();
        System.out.println("---------------------");
        calculator2.showStatistics();
        System.out.println("---------------------");
        calculator3.showStatistics();
        System.out.println("---------------------");
    }
}
