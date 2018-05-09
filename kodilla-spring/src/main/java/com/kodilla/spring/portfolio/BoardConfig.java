package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Qualifier("toDoList")
    @Autowired
    List<String> tasks;

    @Bean(name = "toDoList")
    public ArrayList<String> getToDoList() {
        return new ArrayList<>();
    }

    @Bean(name = "inProgressList")
    public ArrayList<String> getInProgressList() {
        return new ArrayList<>();
    }

    @Bean(name = "doneList")
    public ArrayList<String> getDoneList() {
        return new ArrayList<>();
    }
}
