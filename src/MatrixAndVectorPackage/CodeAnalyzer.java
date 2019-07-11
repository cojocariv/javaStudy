package MatrixAndVectorPackage;

import java.util.Arrays;

public class CodeAnalyzer {
    public static void analyzeClass(Object o) {
        /*
         * Вывести название класса, к которому принадлежит объект o
         * Вывести названия всех переменных этого класса
         * Вывести названия всех методов этого класса*/
        Class clazz = o.getClass();
        System.out.println("Имя класса: " + clazz);
        System.out.println("Поля класса: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Родительский класс: " + clazz.getSuperclass());
        System.out.println("Методы класса: " +  Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(clazz.getConstructors()));


    }

    public static void main(String[] args) {
        analyzeClass(new Matrix("mat", 5,6, 3));
    }
}
