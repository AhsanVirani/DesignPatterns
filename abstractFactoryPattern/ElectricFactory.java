package abstractFactoryPattern;

public class ElectricFactory implements AbstractFactory{
    @Override
    public Car getCar(String type) {
        if(type.equals("FORD"))
            return new ElectricFord();
        else if(type.equals("TOYOTA"))
            return new ElectricToyota();
        return null;
    }
}
