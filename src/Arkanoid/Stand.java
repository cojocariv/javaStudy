package Arkanoid;

public class Stand extends BaseObject {
    private double speed;
    private double direction;
    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };


    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    @Override
    public void move() {
        double dx = speed * direction;
        x = x + dx;
    }

    @Override
    public boolean isIntersec(BaseObject o) {
        return false;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'M');
    }

    public void moveLeft() {
        direction = -1;
    }

    public void moveRight() {
        direction = 1;
    }
}
