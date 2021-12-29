package flyweightPattern;

public class Rectangle implements Shape {
    private int x;
    private int y;
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle " + color + " x=" + x + " y=" + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
