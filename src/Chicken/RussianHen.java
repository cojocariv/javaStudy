package Chicken;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 01.04.19
 * Time: 11:28
 * To change this template use File | Settings | File Templates.
 */
public class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 3;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
