package InputAndOutput;

import java.io.*;

class MyClass {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("c:/users/cojocari/desktop/source.txt");
             FileOutputStream fout = new FileOutputStream("c:/users/cojocari/desktop/source2")) {
            byte [] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            fout.write(buffer, 0, buffer.length);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
