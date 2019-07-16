package test15;

import java.io.*;
import java.net.URL;

class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
Animal animal = new Animal();
animal.eat();

Animal animal2 = new Animal(){
    public void eat(){
        System.out.println("Animal is eating, anonimous class...");
    }
};
animal2.eat();
    }
}
