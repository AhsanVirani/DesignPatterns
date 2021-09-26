package prototypePattern;

public class Rectangle extends Shape{
    public Rectangle(int width, int height){
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle of width: " + width + " Height: " + height);
    }  

    @Override
    public Shape cloneObject() {
        // PrototypePattern
        return new Rectangle(width, height);
    }
}
