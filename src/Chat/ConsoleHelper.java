package Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)  {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        while (true) {
            try {
                return reader.readLine();

            } catch (IOException e) {
                writeMessage("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
    }

    public static int readInt() throws IOException {
        while (true){
            try {
                return Integer.parseInt(readString());
            } catch (NumberFormatException e) {
                writeMessage("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
    }
}
