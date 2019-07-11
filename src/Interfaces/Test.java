package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        info1.sleep();
        info2.sleep();
        outputInfo(info1);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
