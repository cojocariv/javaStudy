import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
 * Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
 * "Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5,
 * "Нормальный: между 18.5 и 24.9" - если индекс массы тела между 18.5 и 24.9,
 * "Избыточный вес: между 25 и 29.9" - если индекс массы тела между 25 и 29.9,
 * "Ожирение: 30 или больше" - если индекс массы тела 30 или больше.
 * <p>
 * Подсказка:
 * Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
 */


public class MassaTela {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

       calculateMassIndex(weight, height);
    }

   //public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double index = weight / (height * height);
            if (index < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (index > 18.5 && index < 24.9) {
                System.out.println("Нормальный: между 18.5 и 24.9");
            } else if (index > 25 && index < 29.9) {
                System.out.println("Избыточный вес: между 25 и 29.9");
            } else if (index >= 30) {
                System.out.println("Ожирение: 30 или больше");
            }

        }
    }
//}