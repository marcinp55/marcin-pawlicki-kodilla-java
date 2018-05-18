package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TestFactoryTestSuite {
    @Test
    public void drivingTaskTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
    }

    @Test
    public void paintingTaskTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
    }

    @Test
    public void shoppingTaskTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
    }
}
