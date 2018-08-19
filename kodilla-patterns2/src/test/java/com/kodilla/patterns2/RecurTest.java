package com.kodilla.patterns2;

import org.junit.Test;

public class RecurTest {
    private static class Counter {
        public static void getLess(int n) {
            if (n <= 0) {
                System.out.println("Reached 0 value");
            } else {
                System.out.println("Reached " + n);
                Counter.getLess(n - 1);
            }
        }
    }

    @Test
    public void test() {
        Counter.getLess(5);
    }
}
