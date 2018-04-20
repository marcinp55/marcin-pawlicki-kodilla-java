package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList= new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(001, "AAA", 'M', LocalDate.of(1995, 03, 12), 3));
        usersList.add(new ForumUser(002, "BBB", 'F', LocalDate.of(2000, 05, 14), 1));
        usersList.add(new ForumUser(003, "CCC", 'M', LocalDate.of(1993, 8, 29), 5));
        usersList.add(new ForumUser(004, "DDD", 'M', LocalDate.of(1987, 01, 05), 8));
        usersList.add(new ForumUser(005, "EEE", 'F', LocalDate.of(1990, 12, 12), 0));
        usersList.add(new ForumUser(006, "FFF", 'M', LocalDate.of(1978, 02, 05), 5));
        usersList.add(new ForumUser(007, "GGG", 'F', LocalDate.of(1999, 02, 14), 9));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
