package prototypePattern;

public abstract class Shape {
    protected int width;
    protected int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void draw();
    public abstract Shape cloneObject();
}
