package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing: begin suite");
    }

    @Before
    public void before() {
        System.out.println("Testing: begin case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Testing: end suite");
    }

    @After
    public void after() {
        System.out.println("Testing: end case");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> exterminatedList = exterminator.exterminate(emptyList);
        //Then
        for (int number : exterminatedList) {
            int mod = number % 2;
            Assert.assertEquals(mod, 0);
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> fullList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        for (int i = 0;i < 25;i++) {
            fullList.add(i);
        }
        //When
        ArrayList<Integer> exterminatedList = exterminator.exterminate(fullList);
        //Then
        for (int number : exterminatedList) {
            int mod = number % 2;
            Assert.assertEquals(mod, 0);
        }
    }
}
