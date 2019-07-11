/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 13.03.19
 * Time: 13:18
 * To change this template use File | Settings | File Templates.
 */
public class TimeMachine {
    public void goToFuture(int currentYear) {

        currentYear = currentYear+10;
    }

    public void goToPast(int currentYear) {

        System.out.println("Метод goToPast начал работу!");

        System.out.println("Значение currentYear внутри метода goToPast (в начале) = " + currentYear);
        currentYear = currentYear-10;
        System.out.println("Значение currentYear внутри метода goToPast (в конце) = " + currentYear);
    }

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();
        int currentYear = 2018;

        System.out.println("Какой год в самом начале работы программы?");
        System.out.println(currentYear);

        timeMachine.goToPast(currentYear);
        System.out.println("А сейчас какой год?");
        System.out.println(currentYear);
    }
}
