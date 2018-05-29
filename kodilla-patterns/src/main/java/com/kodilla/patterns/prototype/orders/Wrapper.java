package com.kodilla.patterns.prototype.orders;

public class Wrapper<T> {
    private T myObject;

    public Wrapper(T myObject) {
        this.myObject = myObject;
    }
}
