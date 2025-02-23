package declaring.defaultmethods;

import java.util.StringJoiner;

public class Actor implements Movable {

    private double x;
    private double y;

    public Actor() {
        this(0, 0);
    }

    public Actor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", getClass().getSimpleName() + "{", "}")
                .add("x=" + x)
                .add("y=" + y)
                .toString();
    }
}
