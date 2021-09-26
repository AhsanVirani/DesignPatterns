package prototypePattern;

public class Square extends Shape{
    public Square(int width, int height){
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Square of width: " + width + " Height: " + height);
    }  

    @Override
    public Shape cloneObject() {
        // PrototypePattern
        return new Square(width, height);
    }
}
