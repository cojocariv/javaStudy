package Arkanoid;

public class Brick extends BaseObject {
    public Brick(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Brick(double x, double y) {
        super(x, y, 3);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean isIntersec(BaseObject o) {
        return false;
    }

    @Override
    public void draw(Canvas canvas) {

    }
}
