package Examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    private String name;       //family
    private int[] m;           //ssilka na masiv otenok
    private double average;    //srednii bal uspevaemosti

    public Student(int ex) throws IOException {
        readName();
        readMarks(ex);
        calcAverage();
    }

    private void readName() throws IOException {
        System.out.print("Please insert the name of student: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                name = br.readLine().trim();

//                System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1));
            } catch (IOException e) {
                Get.error("input channel failures");
            }
            if (name.length() != 0) break;
            Get.error("-the buffer is empty");
        } while (true);
    }

    private void readMarks(int ex) {
        m = new int[ex];
        for (int i = 0; i < m.length; i++) {
            System.out.print("Examen " + (i + 1) + ": ");
            m[i] = Get.Int(1, 10);
        }
    }

    private void calcAverage() {
        average = 0.0f;
        int marksLength = m.length;
        for (int i = 0; i < m.length; i++) {
            average = average / m.length;
        }
    }

    public void showStudent() {
        System.out.printf("%-20s", this.name);

        for (int i = 0; i < this.m.length; i++) {
            System.out.printf("%-5d", m[i]);
        }
        System.out.printf("%2.2f", this.average);
    }

    public int getMark(int i) {
        return m[i];
    }
}
