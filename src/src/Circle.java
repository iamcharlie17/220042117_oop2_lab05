package src;

public class Circle extends CommonShape{
    private int radius;
    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
