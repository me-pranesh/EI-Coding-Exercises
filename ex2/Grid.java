import java.util.HashSet;
import java.util.Set;

public class Grid {
    private final int width;
    private final int height;
    private final Set<Position> obstacles = new HashSet<>();

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addObstacle(Position position) {
        obstacles.add(position);
    }

    public boolean hasObstacle(int x, int y) {
        for (Position obstacle : obstacles) {
            if (obstacle.getX() == x && obstacle.getY() == y) {
                return true;
            }
        }
        return false;
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
