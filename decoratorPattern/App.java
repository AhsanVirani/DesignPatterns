package decoratorPattern;

public class App {
    public static void main(String[] args) {
        Beverage b = new Sugar(new Milk(new PlainBeverage()));
        System.out.println(b.getCost());
        System.out.println(b.getDescription());

        // changing behaviour at runtime (beverage with 2 sugars)
        Beverage b1 = new Sugar(new Sugar(new Milk(new PlainBeverage())));
        System.out.println(b1.getCost());
        System.out.println(b1.getDescription());
    }
}
