package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

public class SudokuDataProcessorTestSuite {
    @Test
    public void testProcessNumberInput() {
        //Given
        SudokuDataProcessor dataProcessor = new SudokuDataProcessor();
        String input = "3,4,6";

        //When
        ArrayList<Integer> processedNumbers = dataProcessor.processNumberInput(input);

        //Then
        Assert.assertEquals(3, processedNumbers.size());
        Assert.assertEquals(Optional.of(3), Optional.ofNullable(processedNumbers.get(0)));
        Assert.assertEquals(Optional.of(4), Optional.ofNullable(processedNumbers.get(1)));
        Assert.assertEquals(Optional.of(6), Optional.ofNullable(processedNumbers.get(2)));
    }
}
