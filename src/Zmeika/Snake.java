package Zmeika;

import java.util.Arrays;
import java.util.Random;

public class Snake {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(numbers));
        for (int h : numbers) {
            System.out.println(h);
        }

    }
}
