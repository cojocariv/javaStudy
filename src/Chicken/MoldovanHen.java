package Chicken;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 01.04.19
 * Time: 11:29
 * To change this template use File | Settings | File Templates.
 */
public class MoldovanHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 1;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
