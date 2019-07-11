package traycatchrangaci;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class Get {
    private static String buf;   //input buffer
    private static int valueInt;  //correct value for type int;
    private static double valueDouble; //correct value for type double;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void showBoxError(String error) {
        JOptionPane.showMessageDialog(null, error, "error!", JOptionPane.ERROR_MESSAGE);
    }

    private static void error(String msg) {
        String diagnosis = msg + ".";
        showBoxError(msg);
        System.out.println("Repeat input: ");
    }

    private static void error(String msg, int min, int max) {
        String diagnosis = msg + "[ " + min + "," + max + "].";
        showBoxError(diagnosis);
        System.out.println("Repeat input: ");
    }

    private static void error(String msg, double min, double max) {
        String diagnosis = msg + "[ " + min + "," + max + "].";
        showBoxError(diagnosis);
        System.out.println("Repeat input: ");
    }

    private static void read() {
        while (true) {
            try {
                buf = br.readLine().trim();
                break;
            } catch (IOException e) {
                error("Insert from keyboard error");
                if (buf.length() != 0) break;
                error("Buffer is empty");
            }
        }
    }

    //methods users class
    public static int Int() throws IOException {
        while (true) {
            try {
                valueInt = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
//                error(" - this is not integer ");
                System.out.println(" - this is not integer ");
                continue;
            }
        }
        return valueInt;
    }


    public static int Int(int min, int max) throws IOException {
        while (true) {
            valueInt = Int();
            if (valueInt >= min && valueInt <= max) {
                break;
            } else {
                System.out.println("The value is not in range " + min + " and " + max);
                continue;
            }
        }
        return valueInt;
    }

    public static double Double() throws IOException {
        while (true) {
            try {
                valueDouble = Double.parseDouble(br.readLine());
                break;
            } catch (NumberFormatException e) {
                // error(" - this is not double ");
                System.out.println(" - this is not integer ");
            }
        }
        return valueDouble;
    }

    public static double Double(double min, double max) throws IOException {
        while (true) {
            valueDouble = Double();
            if (valueDouble >= min && valueDouble <= max) {
                break;
            } else {
                //error("The value is not in range", min, max);
                System.out.println("The value is not in range " + min + " and " + max);
                continue;
            }
        }
        return valueDouble;
    }

    public static void printArrayValues(ArrayList list) {
        System.out.println();
        System.out.print("Array values are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "; ");
        }
    }

}


