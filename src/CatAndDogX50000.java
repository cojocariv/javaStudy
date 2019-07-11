/**
 * Создать в цикле по 50 000 объектов Cat и Dog.
 * <p>
 * (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
 */


public class CatAndDogX50000 {
    public static void main(String[] args) throws Throwable {
        // напишите тут ваш код
        for (int i = 0; i < 50000; i++) {
          Cat43 cat = new Cat43();
          Dog dog = new Dog();

        }
    }
}

class Cat43 {
    @Override
    protected void finalize() throws Throwable {

        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
