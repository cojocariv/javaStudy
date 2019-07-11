package ManagerTest;

import JavaBiblioteca.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    static List<Integer> list = new ArrayList<>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while (true) {
            int i = Integer.parseInt(reader.readLine());
            if (i != 5) {
                list.add(i);
            } else {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index " + i + " is " + list.get(i));
        }
    }
}
