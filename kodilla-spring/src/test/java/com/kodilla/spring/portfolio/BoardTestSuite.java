package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("To do task");
        board.getInProgressList().getTasks().add("In progress task");
        board.getDoneList().getTasks().add("Done task");

        String toDoTask = board.getToDoList().getTasks().get(0);
        String inProgressTask = board.getInProgressList().getTasks().get(0);
        String doneTask = board.getDoneList().getTasks().get(0);
        //Then
        Assert.assertEquals("To do task", toDoTask);
        Assert.assertEquals("In progress task", inProgressTask);
        Assert.assertEquals("Done task", doneTask);
    }
}
