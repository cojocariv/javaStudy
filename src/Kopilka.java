/*
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
        Вывести на экран полученную сумму.

        Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
        String s = buffer.readLine();
        if (s.equals("exit"))
        break;
        }

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Kopilka {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            String klaviatura = reader.readLine();
            if (klaviatura.equals("summa")) {
                break;
            }
            int n = Integer.parseInt(klaviatura);
            sum += n;
        }
        System.out.println(sum);


    }
}