import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChangeFunctional {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }


        ArrayList<String> listX2 = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                listX2.add(s);
                System.out.print(s + " ");
                listX2.add(s);
                System.out.println(s);
            }

            if (s.length() % 2 != 0) {
                listX2.add(s);
                System.out.print(s + " ");
                listX2.add(s);
                System.out.print(s + " ");
                listX2.add(s);
                System.out.println(s);
            }
        }


    }
}

