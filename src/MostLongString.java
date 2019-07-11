import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class MostLongString {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int smoolest = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            int length = strings.get(i).length();
                    if (smoolest < length) {
                        smoolest = length;
                                            }
            System.out.println(smoolest);
                                     }
//        for (String str : strings) {
//            if (str.length() == smoolest)
//                System.out.println(str);
//        }

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            if (str.length() == smoolest) {
               System.out.println(str);
            }
        }



    }
}