import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMas {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] mas = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 20; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        return mas;
    }

    public static int max(int[] array) {
        // найди максимальное значение

        int maxInt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxInt){
                maxInt = array[i];
            }
        }

        return maxInt;
    }
}

