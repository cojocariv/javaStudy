package SildtExemplu;

public class PC {
    public static void main(String[] args) throws CloneNotSupportedException {
        Q qs = new Q();

        new Producer(qs);
        new Consumer(qs);
        System.out.println("Pentru a opri tastati Ctrl-C");
    }
}
