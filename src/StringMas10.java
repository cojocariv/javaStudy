import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringMas10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        for (int i = 0; i < 8; i++) {
            str[i] = reader.readLine();
        }
        for (int i = str.length-1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
