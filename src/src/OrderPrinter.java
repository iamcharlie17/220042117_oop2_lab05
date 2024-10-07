package src;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderPrinter {
    public void printShapesInOrder(List <Shape> shapes){
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                int areaComparison = Double.compare(s1.calculateArea(), s2.calculateArea());
                if(areaComparison != 0) return areaComparison;

                int xComparison = Integer.compare(s1.getX(), s2.getY());
                if(xComparison != 0) return xComparison;


                return Integer.compare(s1.getX(), s2.getY());
            }
        });

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName() +
                    ", Area: " + shape.calculateArea() +
                    ", X: " + shape.getX() +
                    ", Y: " + shape.getY());
        }
    }

}
