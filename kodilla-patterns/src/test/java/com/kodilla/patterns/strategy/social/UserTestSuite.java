package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("JohnFacebook");
        User user2 = new YGeneration("JohnTwitter");
        User user3 = new ZGeneration("JohnSnapchat");

        //When
        String millenialPost = user1.sharePost();
        System.out.println("Millenial Post: " + millenialPost);
        String yGenerationPost = user2.sharePost();
        System.out.println("YGeneration Post: " + yGenerationPost);
        String zGenerationPost = user3.sharePost();
        System.out.println("ZGeneration Post: " + zGenerationPost);

        //Then
        Assert.assertEquals("Facebook", millenialPost);
        Assert.assertEquals("Twitter", yGenerationPost);
        Assert.assertEquals("Snapchat", zGenerationPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("JohnFacebook");

        //When
        String millenialPost = user1.sharePost();
        System.out.println("Before change millenial post: " + millenialPost);
        user1.setSocialPublisher(new SnapchatPublisher());
        String millenialPostAfter = user1.sharePost();
        System.out.println("After change millenial post: " + millenialPostAfter);

        //Then
        Assert.assertEquals("Facebook", millenialPost);
        Assert.assertEquals("Snapchat", millenialPostAfter);
    }
}
