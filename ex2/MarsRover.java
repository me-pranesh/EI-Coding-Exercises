import java.util.Scanner;

public class MarsRover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grid size (width height):");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        Grid grid = new Grid(width, height);

        System.out.println("Enter number of obstacles:");
        int numObstacles = scanner.nextInt();
        System.out.println("Enter obstacle positions (x y):");
        for (int i = 0; i < numObstacles; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            grid.addObstacle(new Position(x, y, Direction.N, grid));  // Use N for obstacle direction
        }

        System.out.println("Enter starting position (x y direction):");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        String dir = scanner.next();
        Direction direction = Direction.valueOf(dir);
        Position startPosition = new Position(startX, startY, direction, grid);

        System.out.println("Enter commands:");
        String commands = scanner.next();
        scanner.close();

        Rover rover = new Rover(startPosition);

        System.out.println("Executing commands: " + commands);
        rover.executeCommands(commands);

        Position finalPosition = rover.getPosition();
        System.out.println("Rover is at (" + finalPosition.getX() + ", " + finalPosition.getY() + ") facing " + finalPosition.getDirection() + ".");
    }
}
