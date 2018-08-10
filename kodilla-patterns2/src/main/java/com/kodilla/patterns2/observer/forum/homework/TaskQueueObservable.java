package com.kodilla.patterns2.observer.forum.homework;

public interface TaskQueueObservable {
    void registerObserver(TaskQueueObserver observer);
    void notifyObservers();
    void removeObserver(TaskQueueObserver observer);
}
