package testhgjd;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.printf("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName());
    }
    public void info(Number s){
        System.out.printf("Дерево № %d , метод Number, параметр %s", number, s.getClass().getSimpleName());
    }
    public void info(String s){
        System.out.printf("Дерево № %d , метод Object, параметр %s", s, s.getClass().getSimpleName());
    }
}
