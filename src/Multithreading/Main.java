package Multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> wordMap = new HashMap<>();
        System.out.println("Please enter some text");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] tokens = s.split(" ");
        for (String token : tokens) {
            String s1 = token.toLowerCase();
            Integer count = wordMap.get(s1);
            if (count == null) {
                wordMap.put(s1, 1);
            } else {
                wordMap.put(s1, count + 1);
            }
        }
        NavigableSet<WordWrapper> wordWrappers = convertToSet(wordMap);
        printSet(wordWrappers);
    }

    private static void printSet(NavigableSet<WordWrapper> wordWrappers) {

    }

    private static NavigableSet<WordWrapper> convertToSet(Map<String, Integer> wordMap) {
        NavigableSet<WordWrapper> wordSet = new TreeSet<>();
        for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            wordSet.add(new WordWrapper(e.getKey(), e.getValue()));
        }
        return wordSet;
    }


    }
