import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> commands;

    public CommandInvoker() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
