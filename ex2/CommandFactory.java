public class CommandFactory {
    public static Command getCommand(char commandType, Position position, Grid grid) {
        switch (commandType) {
            case 'M':
                return new MoveCommand(position, grid);
            case 'L':
                return new TurnLeftCommand(position);
            case 'R':
                return new TurnRightCommand(position);
            default:
                throw new IllegalArgumentException("Invalid command type: " + commandType);
        }
    }
}
