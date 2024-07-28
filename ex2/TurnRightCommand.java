public class TurnRightCommand implements Command {
    private Position position;

    public TurnRightCommand(Position position) {
        this.position = position;
    }

    @Override
    public void execute() {
        position.turnRight();
    }
}
