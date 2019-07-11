import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StringMin {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int smoolest = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
            int length = list.get(i).length();
            if (smoolest > length) {
                smoolest = length;
            }
        }
        for (String str : list) {
            if (str.length() == smoolest)
                System.out.println(str);
        }

    }
}
