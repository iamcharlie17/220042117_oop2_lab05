package src;

public class ShapeFactory {
    public static Shape createShape(String type, int x, int y, int... dimensions){
        return switch (type.toLowerCase()) {
            case "square" -> new Square(x, y, dimensions[0]);
            case "rectangle" -> new Rectangle(x, y, dimensions[0], dimensions[1]);
            case "circle" -> new Circle(x, y, dimensions[0]);
            default -> throw new IllegalArgumentException("Unknown shape");
        };
    }
}
