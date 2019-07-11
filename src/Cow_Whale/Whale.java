package Cow_Whale;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 19.03.19
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class Whale extends Cow {
    public void printName() {
        System.out.println("Its not right");
        super.printName();
        System.out.println("I am a whole");
    }
}
