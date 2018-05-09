package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public void diplayVal(double val) {
        System.out.println("Value: " + val);
    }
}
