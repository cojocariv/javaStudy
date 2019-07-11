package Chicken;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 01.04.19
 * Time: 11:29
 * To change this template use File | Settings | File Templates.
 */
public class BelarusianHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 2;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
