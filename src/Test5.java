import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 15.03.19
 * Time: 14:35
 * To change this template use File | Settings | File Templates.
 */
public class Test5 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName(){
            return "dasf";
        }
        public Pet getChild(){
            return new Cat();
        }
    }
}