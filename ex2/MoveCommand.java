public class MoveCommand implements Command {
    private Position position;
    private Grid grid;
    private boolean obstacleDetected = false;
    private Position obstaclePosition;

    public MoveCommand(Position position, Grid grid) {
        this.position = position;
        this.grid = grid;
    }

    @Override
    public void execute() {
        int currentX = position.getX();
        int currentY = position.getY();
        Direction currentDirection = position.getDirection();

        int newX = currentX + currentDirection.getDeltaX();
        int newY = currentY + currentDirection.getDeltaY();

        if (grid.isWithinBounds(newX, newY)) {
            if (!grid.hasObstacle(newX, newY)) {
                position.setX(newX);
                position.setY(newY);
            } else {
                obstacleDetected = true;
                obstaclePosition = new Position(newX, newY, currentDirection, grid);
            }
        } else {
            System.out.println("Rover cannot move outside the grid.");
        }
    }

    public boolean isObstacleDetected() {
        return obstacleDetected;
    }

    public Position getObstaclePosition() {
        return obstaclePosition;
    }
}
