/**
 * В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
 */


public class CatCount {
    public static int count = 0;


    CatCount() {
        count++;
    }

    protected void finalize() throws Throwable {
        count--;
    }


    public static void main(String[] args) {


    }


}
