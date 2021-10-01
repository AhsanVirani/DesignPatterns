package commandPattern;

public class TurnOffCommand implements Command {
    private Light light; // receiver
    
    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
