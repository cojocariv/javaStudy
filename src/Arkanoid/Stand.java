package Arkanoid;

public class Stand extends BaseObject {
    public Stand(double x, double y, double radius) {
        super(x, y, radius);
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
