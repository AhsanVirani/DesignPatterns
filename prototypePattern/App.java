package prototypePattern;

public class App {
    public static void main(String[] args) {
        Shape square = new Square(10, 5);
        square.draw();

        Shape rectangle = new Rectangle(10, 5);
        rectangle.draw();
    }
}
