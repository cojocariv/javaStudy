package TheNewBoston2;

import javafx.collections.transformation.SortedList;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

public class Solution {
    public static void main(String[] args) {
//
//        String[] studd = {"babies", "watermelong", "melons", "fudge"};
//
//        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(studd));
//        thelist.add("pump");
//        thelist.addFirst("Firstthing");
//
//        for (String e : thelist) {
//            System.out.println(e);
//        }
//        System.out.println("//////////////");
//        thelist.addLast("capsuna");
//        for (String e : thelist) {
//            System.out.println(e);
//        }
//        System.out.println("/////////////  set");
//        TreeSet set = new TreeSet(Arrays.asList(studd));
//            System.out.println(set);


        SortedSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        fruits.add("Apple");

        System.out.println("Fruits Set after add: " + fruits);

    }
}