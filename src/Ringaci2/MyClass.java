package Ringaci2;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 27.03.19
 * Time: 8:47
 * To change this template use File | Settings | File Templates.
 */
public class MyClass {
    int a1, a2;

    MyClass(int a1) {
        this.a1 = a1;
    }

    MyClass(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
      public String toString(){
        return String.format("a1 = %d, a2 = %d", a1, a2);
    }
    public static void main(String[] args) {
        MyClass class1 = new MyClass(4);
        System.out.println(class1);
    }
}
