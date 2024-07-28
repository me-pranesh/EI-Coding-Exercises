public enum Direction {
    N("NORTH", 0, 1),
    E("EAST", 1, 0),
    S("SOUTH", 0, -1),
    W("WEST", -1, 0);

    private final String name;
    private final int deltaX;
    private final int deltaY;

    Direction(String name, int deltaX, int deltaY) {
        this.name = name;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public Direction turnLeft() {
        switch (this) {
            case N:
                return W;
            case E:
                return N;
            case S:
                return E;
            case W:
                return S;
            default:
                throw new IllegalArgumentException("Invalid direction");
        }
    }

    public Direction turnRight() {
        switch (this) {
            case N:
                return E;
            case E:
                return S;
            case S:
                return W;
            case W:
                return N;
            default:
                throw new IllegalArgumentException("Invalid direction");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
