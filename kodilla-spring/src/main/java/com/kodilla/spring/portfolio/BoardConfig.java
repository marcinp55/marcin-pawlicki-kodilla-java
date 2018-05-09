package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Qualifier("toDoList")
    @Autowired
    TaskList toDoTasks;
    @Qualifier("inProgressList")
    @Autowired
    TaskList inProgressTasks;
    @Qualifier("doneList")
    @Autowired
    TaskList doneTasks;

    @Bean
    public Board getBoard() {
        return new Board(toDoTasks, inProgressTasks, doneTasks);
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
