import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;


public class ArraySort {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

//        for (int x : array) {
//            System.out.println(x);
//        }
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = array.length-1; i > 0; i--) {
            Arrays.sort(array);
        }


    }
}
