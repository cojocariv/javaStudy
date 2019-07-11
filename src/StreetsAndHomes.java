import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreetsAndHomes {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumPar = 0;
        int sumImpar = 0;
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 1; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sumPar = sumPar + numbers[i];
            } else {
                sumImpar = sumImpar + numbers[i];
            }
        }
        int sumParFinal = sumPar + numbers[0];
        System.out.println(sumImpar > sumParFinal ? "В домах с нечетными номерами проживает больше жителей." : "В домах с четными номерами проживает больше жителей.");

    }
}