public class Rover {
    private Position position;

    public Rover(Position startPosition) {
        this.position = startPosition;
    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            Command cmd = CommandFactory.getCommand(command, position, position.getGrid());
            if (cmd instanceof MoveCommand) {
                MoveCommand moveCmd = (MoveCommand) cmd;
                moveCmd.execute();
                if (moveCmd.isObstacleDetected()) {
                    System.out.println("Rover's coordinates at the time of obstacle detection: (" + position.getX() + ", " + position.getY() + ")");
                    Position obstaclePosition = moveCmd.getObstaclePosition();
                    System.out.println("Obstacle coordinates: (" + obstaclePosition.getX() + ", " + obstaclePosition.getY() + ")");
                    break;
                }
            } else {
                cmd.execute();
            }
        }
    }

    public Position getPosition() {
        return position;
    }
}
