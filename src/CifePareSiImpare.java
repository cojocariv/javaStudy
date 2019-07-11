/**
 * Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
 * Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
 * Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
 * Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
 * Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
 */


import java.io.*;

public class CifePareSiImpare {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String g = reader.readLine();
        int m = g.length();

        for (int i = 0; i < m; i++) {
            char r = g.charAt(i);
            if (r%2==0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
