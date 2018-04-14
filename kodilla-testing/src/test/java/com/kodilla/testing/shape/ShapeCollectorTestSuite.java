package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    static int counter = 1;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting test suite.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("End of test suite.");
    }

    @Before
    public void beforeCase() {
        System.out.println("Starting test number " + counter);
    }
    @After
    public void afterCase() {
        System.out.println("Ending test number " + counter);
        counter++;
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle(5, 7);
        //When
        collector.addFigure(triangle);
        //Then
        Assert.assertEquals(triangle, collector.figures.get(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(5);
        collector.addFigure(circle);
        //When
        boolean result = collector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square(8);
        collector.addFigure(square);
        //When
        Shape shape = collector.getFigure(0);
        //Then
        Assert.assertEquals(square, shape);
    }
}
