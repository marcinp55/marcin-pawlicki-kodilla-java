package com.kodilla.patterns2.observer.forum.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue johnsTaskQueue = new JohnTaskQueue();
        TaskQueue bobsTaskQueue = new BobTaskQueue();
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");
        Mentor mentor3 = new Mentor("Mentor3");
        johnsTaskQueue.registerObserver(mentor1);
        bobsTaskQueue.registerObserver(mentor2);
        johnsTaskQueue.registerObserver(mentor3);
        bobsTaskQueue.registerObserver(mentor3);

        //When
        johnsTaskQueue.addTask("For loops");
        bobsTaskQueue.addTask("While loops");
        bobsTaskQueue.addTask("REST");
        johnsTaskQueue.addTask("Exceptions");
        johnsTaskQueue.addTask("Streams");

        //Then
        Assert.assertEquals(3, mentor1.getUpdateCount());
        Assert.assertEquals(2, mentor2.getUpdateCount());
        Assert.assertEquals(5, mentor3.getUpdateCount());
    }
}
