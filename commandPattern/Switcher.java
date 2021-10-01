package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    public List<Command> commands;

    public Switcher() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeCommand() {
        for(Command command : commands)
            command.execute();
    }
}
