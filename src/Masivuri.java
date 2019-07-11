import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Masivuri {
    public static void main(String[] args) throws Exception {
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] numere = new int[5];
        System.out.println("Introduceti numerele");
        for (int i = 0; i < numere.length; i++) {
            numere[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Suma numerelor este: ");
        for (int i = 0; i < numere.length; i++) {
            sum = sum + numere[i];
        }
        System.out.println(sum);
*/

        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        System.out.println(min);
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println ("Min is " + min);
    }
        }

