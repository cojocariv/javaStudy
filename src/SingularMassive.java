import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SingularMassive {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = new String[10];
//        int[] numbers = new int[10];
//
//        for (int i = 0; i < str.length; i++) {
//            str[i] = reader.readLine();
//            System.out.println(str[i].length());
//        }
        int[] bigArr = new int[20];
        int[] smallArr1 = new int[bigArr.length/2];
        int[] smallArr2 = new int[bigArr.length/2];

        Scanner scan = new Scanner(System.in);
//заполняем большой массив
        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = scan.nextInt();
        }
//заполняем первый маленький
        for (int i = 0; i < smallArr1.length; i++) {
            smallArr1[i] = bigArr[i];
        }
//заполняем второй маленький - здесь пришлось помучится с индексами большого массива
        for (int i = 0; i < smallArr2.length; i++) {
            smallArr2[i] = bigArr[i+smallArr1.length];
        }
        // выводим маленький
        for (int i = 0; i < smallArr2 .length; i++){
            System.out.println(smallArr2[i]);
        }

//        for (int i = 0; i < ; i++) {
//
//        }

    }
}
