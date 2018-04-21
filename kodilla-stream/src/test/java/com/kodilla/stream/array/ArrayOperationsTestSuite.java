package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[10];
        for (int i = 0;i < numbers.length;i++) {
            numbers[i] = i + 1;
        }

        //When
        Double avg = ArrayOperations.getAverage(numbers);
        System.out.println("Average: " + avg);

        //Then
        Assert.assertEquals(5.5, avg, 0.001);
    }
}
