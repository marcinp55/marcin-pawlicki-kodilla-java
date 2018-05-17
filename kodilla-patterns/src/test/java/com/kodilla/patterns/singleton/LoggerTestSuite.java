package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void logTest() {
        //Given
        //When
        Logger.getLoggerInstance().log("Log test");
        //Then
        Assert.assertEquals("Log test", Logger.getLoggerInstance().getLastLog());
    }
}
