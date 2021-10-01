package commandPattern;

public class TurnOnCommand implements Command {
    private Light light; // receiver
    
    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
