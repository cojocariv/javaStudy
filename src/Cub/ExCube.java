package Cub;

import java.util.Random;

public class ExCube {
    public static void showArray(Cube c[]) {
        for (int i = 0; i < c.length; i++) {

            c[i] = new Cube();
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("Cub name: cub" + i);
            c[i].show();
            System.out.println();
        }
    }

    public static void calcColor(Cube c[]) {
        int red = 0;
        int yellow = 0;
        int green = 0;
        int blue = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i].getColorCode() == 1) {
                red++;
            }
            if (c[i].getColorCode() == 2) {
                yellow++;
            }
            if (c[i].getColorCode() == 3) {
                green++;
            }
            if (c[i].getColorCode() == 4) {
                blue++;
            }
        }
        System.out.println("\nThe Red= " + red + "; The Yellow= " + yellow + "; The Green= " + green + "; The Blue= " + blue);
    }

    public static void calcVolume(Cube c[]) {
        int vol = 0;
        for (int i = 0; i < c.length; i++) {
            vol += c[i].volume();
        }
        System.out.println("\nThe total volume are= " + vol);
    }

    public static void main(String[] args) {
        Cube[] c = new Cube[20];
        showArray(c);
        calcColor(c);
        calcVolume(c);


    }


}
