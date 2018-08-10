package com.kodilla.patterns2.observer.forum.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements TaskQueueObservable {
    private final String name;
    private final List<String> tasks;
    private final List<TaskQueueObserver> observers;

    public TaskQueue(String name) {
        this.tasks = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(TaskQueueObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (TaskQueueObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(TaskQueueObserver observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
