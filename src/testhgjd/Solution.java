package testhgjd;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Solution {
    public static void main(String[] args) {
double x = Double.parseDouble(args[0]);
double y = Double.parseDouble(args[1]);
for (Operation o: Operation.values()){
    System.out.printf("%f %s %f = %f%n", x, o, y, o.apply(x,y));
}


    }
}

