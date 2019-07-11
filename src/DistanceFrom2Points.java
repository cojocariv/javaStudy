/**
 * Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
 * Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
 */

public class DistanceFrom2Points {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        return Math.sqrt((x2-x1)^2+(y2-y1)^2);
    }
//(x2−x1)2+(y2−y1)2

    public static void main(String[] args) {
        DistanceFrom2Points dist = new DistanceFrom2Points();
        System.out.println((double)getDistance(3, 4, 5, 6));
    }
}
