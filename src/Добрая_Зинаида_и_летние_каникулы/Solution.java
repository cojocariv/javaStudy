package Добрая_Зинаида_и_летние_каникулы;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallone1", df.parse("September 1 1980"));
        map.put("Stallone2", df.parse("JUNE 6 1980"));
        map.put("Stallone3", df.parse("November 1 1980"));
        map.put("Stallone4", df.parse("January 7 1980"));
        map.put("Stallone5", df.parse("Marth 3 1980"));
        map.put("Stallone6", df.parse("August 9 1980"));
        map.put("Stallone7", df.parse("May 3 1980"));
        map.put("Stallone8", df.parse("December 1 1980"));
        map.put("Stallone9", df.parse("April 1 1980"));

        //напишите тут ваш код
        return null;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        //set.removeIf(element -> element > 10);

        map.values().removeIf(s -> s.toString().contains("Jul") || s.toString().contains("Jun") || s.toString().contains("Aug"));

    }

    public static void main(String[] args) {

    }
}

