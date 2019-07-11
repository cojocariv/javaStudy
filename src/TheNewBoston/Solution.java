package TheNewBoston;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static int marimeaArrayului;

    public static void main(String[] args) throws IOException {
        System.out.println("Din cite numere sa fie alcatuit array-ul: ");
        while (true) {
            try {
                marimeaArrayului = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Repetati introducerea numarului");
                continue;
            }
        }
        String[] words = new String[marimeaArrayului];
//        for (int i = 1; i <= marimeaArrayului; i++) {
//            if (i == 1) {
//                System.out.println("Introduceti " + i + " valoare");
//            } else {
//                System.out.println("Introduceti a " + i + " valoare");
//            }
//        }
        for (int i = 0; i < marimeaArrayului; i++) {
            if (i == 0) {
                System.out.println("Introduceti 1 valoare");
            } else if (i >= 1) {
                System.out.println("Introduceti a " + (i + 1) + " valoare");
            }
            words[i] = reader.readLine();
        }

        System.out.println("Alegeti cu ce litere sa inceapa cuvintul ales: ");

        String cautare = reader.readLine().trim();

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(cautare)) {
                System.out.println(words[i] + " starts with " + cautare);
            }
        }


//        for (int i = 0; i < words.length; i++) {
//            if (!words[i].startsWith(cautare)) {
//                System.out.println("Nu exista nici un cuvint care sa inceapa cu litera/literele " + cautare);
//            }else {
//                System.out.println(" ");
//            }
//    }
    }
}