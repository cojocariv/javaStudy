/**
 * Сделать класс StringHelper, у которого будут 2 статических метода:
 * String multiply(String s, int count) - возвращает строку повторенную count раз.
 * String multiply(String s) - возвращает строку повторенную 5 раз.
 */

import java.lang.StringBuilder;

public class StringHelper {

    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш ко
        for (int i = 0; i < 5; i++) {
           result = result+s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result = result+s;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.print(multiply("amigo",8));

    }
}
