package Arkanoid;

public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;

    public Ball(double x, double y, double radius, double speed, double direction, double dx, double dy, boolean isFrozen) {
        super(x, y, radius = 1);
        this.speed = speed;
        this.direction = direction;
        this.dx = dx;
        this.dy = dy;
        this.isFrozen = true;
    }

    public void setDirection(double direction) {
        this.direction = direction;
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }

    public void checkRebound(int minx, int maxx, int miny, int maxy) {

    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void move() {
        if (isFrozen) return;

        x += dx;
        y += dy;

    }

    @Override
    public boolean isIntersec(BaseObject o) {
        return false;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');
    }

    public void start() {
        this.setDirection(direction);
        this.isFrozen = false;

    }
}
