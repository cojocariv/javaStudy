import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            arr.add(reader.readLine());
//        }
//
//        for (int i = arr.size(); i > 0; i--) {
//            System.out.println(arr.get(i-1));
//        }
        ArrayList<String> list = new ArrayList<String>();
        list.add("dasd");
        list.add("dadfgsd");
        list.add("dadgfdsd");
        list.add("dasdfsd");
        list.add("dbgfasd");

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));

        }
    }
}
