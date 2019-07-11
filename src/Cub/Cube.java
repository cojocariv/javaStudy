package Cub;

import java.util.Random;

public class Cube {
    private int size;
    private int colorCode;
    private int materialCode;
    Random r = new Random();

    public Cube() {
        size = r.nextInt((10 - 3) + 1) + 3;
        colorCode = r.nextInt(4) + 1;
        materialCode = r.nextInt(3) + 1;
    }

    private String getColor() {
        String result = null;
        if (colorCode == 1) result = "Red";
        if (colorCode == 2) result = "Yellow";
        if (colorCode == 3) result = "Green";
        if (colorCode == 4) result = "Blue";
        return result;
    }

    private String getMaterial() {
        String result = null;
        if (materialCode == 1) result = "Wood";
        if (materialCode == 2) result = "Plastic";
        if (materialCode == 3) result = "Cartoon";
        return result;
    }

    public int getColorCode() {
        return colorCode;
    }

    public int volume() {
        return size * 3;
    }

    public void show() {
        System.out.println("Size= " + size + "; Color= " + getColor() + "; Material= " + getMaterial() + ".");

    }
}
