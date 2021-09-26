package abstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if(factory.equals("ELECTRIC"))
            return new ElectricFactory();    
        else if(factory.equals("PETROL"))
            return new PetrolFactory();
        return null;    
    }
}
