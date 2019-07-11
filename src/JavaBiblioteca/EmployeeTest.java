package JavaBiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.NumberFormat;

public class EmployeeTest {
    public static void main(String[] args) throws IOException {

        NumberFormat current = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(current.format(x));


    }
}
