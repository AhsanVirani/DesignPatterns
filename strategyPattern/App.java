package strategyPattern;

public class App {
    public static void main(String[] args) {
        OperationManager manager = new OperationManager();
        
        manager.setStrategy(new Add());
        manager.execute(5, 10);

        manager.setStrategy(new Multiply());
        manager.execute(5, 10);

        manager.setStrategy(new Subtract());
        manager.execute(5, 10);
    }
}