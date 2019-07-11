package Passgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class PasswordGenerator {
    public static void main(String[] args) {
        String result = makePassword(12);
        System.out.println(result);


    }

    public static String makePassword(int length) {
        String password = "";
        for (int i = 0; i < length - 2; i++) {
            password = password + randomCharacter("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM");
        }
        String randomSymbol = randomCharacter("+-*/?!@#$%^");
        password = insertAtRandom(password, randomSymbol);
        return password;
    }

    public static String randomCharacter(String characters) {
        int n = characters.length();
        int r = (int) (n * Math.random());
        return characters.substring(r, r + 1);
    }

    public static String insertAtRandom(String str, String toInsert) {
        int n = str.length();
        int r = (int) ((n + 1) * Math.random());
        return str.substring(0, r) + toInsert + str.substring(r);
    }
}
