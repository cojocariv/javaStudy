package reformatDate;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM d, y", Locale.ENGLISH);

        System.out.println(newFormat.format(new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(new BufferedReader(new InputStreamReader(System.in)).readLine())).toUpperCase());
    }
}
