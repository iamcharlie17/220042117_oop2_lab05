package src;

public abstract class CommonShape implements Shape {
    protected int x, y;
    public CommonShape(int x, int y){
        this.x = x;
        this.y = y;
    }


    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

}
