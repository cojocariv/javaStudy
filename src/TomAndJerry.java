/**
 * Создай классы Dog, Cat, Mouse.
 * Добавь по три поля в каждый класс, на твой выбор.
 * Создай объекты для героев мультика Том и Джерри.
 * Так много, как только вспомнишь.
 * <p/>
 * Пример:
 * Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
 * где 12 - высота в см,
 * 5 - длина хвоста в см.
 */
public class TomAndJerry {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 3, 5);
        Dog grivei = new Dog("Grivei", 5, 9);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog  {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;
        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    //напишите тут ваш код
}

