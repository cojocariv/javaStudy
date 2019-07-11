package Cow_Whale;

public class Solution {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {5, 3, 6, 3, 6, 2, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);


    }
}


