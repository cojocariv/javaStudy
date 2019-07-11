package CharsRepeat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
//        FileInputStream input = new FileInputStream(args[0]);
//        String input = "Hello";
        String input = "Hello CSHarp! Hello Claf! JavaSE 8.";
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] words = pattern.split(input);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

//        for(String word:words)
//            System.out.println(word);

    }
}

