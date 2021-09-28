package strategyPattern;

// abstract lyer in between the high modules and low level modules
public class OperationManager {
    // Composition
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        this.strategy.execute(num1, num2);
    }
}
