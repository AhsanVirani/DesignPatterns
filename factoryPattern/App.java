package factoryPattern;

public class App {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.getAnimal(AnimalType.CAT);
        cat.eat();

        Animal lion = AnimalFactory.getAnimal(AnimalType.LION);
        lion.eat();
    }
}
