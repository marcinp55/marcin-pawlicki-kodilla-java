package com.kodilla.patterns2.observer.forum.homework;

public class Mentor implements TaskQueueObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ", there is a new task to check in queue: " + taskQueue.getName());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
