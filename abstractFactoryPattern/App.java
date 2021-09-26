package abstractFactoryPattern;

public class App {
    public static void main(String[] args) {
        AbstractFactory electric = FactoryProducer.getFactory("ELECTRIC");
        electric.getCar("FORD").assemble();

        AbstractFactory petrol = FactoryProducer.getFactory("ELECTRIC");
        petrol.getCar("TOYOTA").assemble();
    }
    
}
