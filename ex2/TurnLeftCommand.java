public class TurnLeftCommand implements Command {
    private Position position;

    public TurnLeftCommand(Position position) {
        this.position = position;
    }

    @Override
    public void execute() {
        position.turnLeft();
    }
}
