package commandPattern;

public class App {
    public static void main(String[] args) {
        Switcher switcher = new Switcher(); // switcher or invoker

        Light light = new Light();  // receiver
        TurnOnCommand onCommand = new TurnOnCommand(light); // command A
        TurnOffCommand offCommand = new TurnOffCommand(light); // command B
        
        switcher.addCommand(onCommand);
        switcher.addCommand(offCommand);

        switcher.executeCommand();
    }
}
