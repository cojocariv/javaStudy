/**
 Сделать класс Calculator, у которого будут 5 статических методов:
 int plus(int a, int b) - возвращает сумму чисел a и b
 int minus(int a, int b) - возвращает разницу чисел a и b
 int multiply(int a, int b) - возвращает результат умножения числа a на число b
 double division(int a, int b) - возвращает результат деления числа a на число b
 double percent(int a, int b) - возвращает b процентов из числа a
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код

        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a/b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (double)(a*b)/100;
    }

    public static void main(String[] args) {
       // Calculator calc = new Calculator();
        //System.out.println(calc.division(5,6));

        char aa = 'A';
        for (int i = 0; i < 20; i++) {
            aa++;
            System.out.println(aa);
        }

    }
}