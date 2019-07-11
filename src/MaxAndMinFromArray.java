import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxAndMinFromArray {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num[] = new int[20];

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
            if (num[i] < minimum)
                minimum = num[i];
            if (num[i] > maximum)
                maximum = num[i];
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);

    }
}