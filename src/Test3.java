import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 12.03.19
 * Time: 8:14
 * To change this template use File | Settings | File Templates.
 */
public class Test3 {
    public static void main(String[] args) {
        int x = 7;
        incrementNumber(x);
        System.out.println(x);

        Comp1 cp = new Comp1(3);
        compLevelUp(cp);
        System.out.println(cp.getAge());
    }

    public static void compLevelUp(Comp1 comp) {
        comp.setAge(comp.getAge() + 1);
    }

    public static void incrementNumber(int x) {
        ++x;
    }
}

class Comp1 {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Comp1(int age) {
        this.age = age;
    }

    private int age;

}
