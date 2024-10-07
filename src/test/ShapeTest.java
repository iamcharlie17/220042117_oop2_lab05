package test;

import org.junit.jupiter.api.Test;
import src.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ShapeTest {

    @Test
    public void testSquareArea() {
        Shape square = new Square(0, 0, 5);
        assertEquals(25.0, square.calculateArea(), 1);
    }
    @Test
    public void testRectangularArea(){
        Shape rectangular = new Rectangle(0, 0, 6, 4);
        assertEquals(24.0, rectangular.calculateArea(), 1);
    }

    @Test
    public void testCircleArea(){
        Shape circle = new Circle(0, 0, 3);
        assertEquals(28.0, circle.calculateArea(), 1);
    }

    @Test
    public void testShapeOrderingByArea() {
        Shape square = new Square(0, 0, 4);
        Shape rectangle = new Rectangle(0, 0, 2, 5);
        Shape circle = new Circle(0, 0, 3);

        List<Shape> shapes = Arrays.asList(square, rectangle, circle);
        new OrderPrinter().printShapesInOrder(shapes);

        assertEquals(10.0, shapes.get(0).calculateArea(), 1);
        assertEquals(16.0, shapes.get(1).calculateArea(), 1);
        assertEquals(28.27, shapes.get(2).calculateArea(), 1);
    }
    @Test
    public void testShapeOrderingByXandY() {
        Shape square1 = new Square(1, 2, 4);
        Shape square2 = new Square(0, 1, 4);
        Shape square3 = new Square(1, 1, 4);

        List<Shape> shapes = Arrays.asList(square1, square2, square3);
        new OrderPrinter().printShapesInOrder(shapes);

        assertEquals(0, shapes.get(0).getX());
        assertEquals(1, shapes.get(1).getX());
        assertEquals(1, shapes.get(2).getX());
        assertEquals(2, shapes.get(2).getY());
    }

    @Test
    public void testShapeOrderingSameAreaDifferentX() {
        Shape square = new Square(2, 1, 3);
        Shape rectangle = new Rectangle(1, 1, 3, 3);

        List<Shape> shapes = Arrays.asList(square, rectangle);
        new OrderPrinter().printShapesInOrder(shapes);

        assertEquals(2, shapes.get(0).getX());
        assertEquals(1, shapes.get(1).getX());
    }
    @Test
    public void testShapeOrderingSameAreaSameXDifferentY() {
        Shape square1 = new Square(1, 3, 3);
        Shape square2 = new Square(1, 1, 3);

        List<Shape> shapes = Arrays.asList(square1, square2);
        new OrderPrinter().printShapesInOrder(shapes);

        assertEquals(1, shapes.get(0).getY());
        assertEquals(3, shapes.get(1).getY());
    }
    @Test
    public void testShapeOrderingSameAreaSameXSameY() {
        Shape square1 = new Square(1, 1, 3);
        Shape square2 = new Square(1, 1, 3);

        List<Shape> shapes = Arrays.asList(square1, square2);
        new OrderPrinter().printShapesInOrder(shapes);

        assertEquals(square1, shapes.get(0));
        assertEquals(square2, shapes.get(1));
    }
    @Test
    public void testComplexShapeOrdering() {
        Shape square = new Square(2, 2, 4);
        Shape rectangle = new Rectangle(1, 1, 4, 5);
        Shape circle = new Circle(3, 3, 2);

        List<Shape> shapes = Arrays.asList(square, rectangle, circle);
        new OrderPrinter().printShapesInOrder(shapes);

        assertEquals(circle, shapes.get(0));
        assertEquals(square, shapes.get(1));
        assertEquals(rectangle, shapes.get(2)); 
    }

}

