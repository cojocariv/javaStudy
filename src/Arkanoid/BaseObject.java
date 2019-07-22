package Arkanoid;

public abstract class BaseObject {
    protected double x, y, radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();

    /*Т.к. объекты мы условно считаем кругами, то предлагаю такую формулу взаимодействия:
если центр круга одного объекта попал в круг другого, то будем считать, что они столкнулись.

Или еще проще:
дистанция_между_объектами <= max (радиус_первого_объекта, радиус_второго_объекта)*/

    public boolean isIntersec(BaseObject o){
        return StrictMath.sqrt((o.getX()-x)*(o.getX()-x) + (o.getY()-y)*(o.getY()-y) ) <= (o.getRadius() > radius ? o.getRadius() : radius);
    }
}
