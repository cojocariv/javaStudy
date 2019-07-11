import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 11.03.19
 * Time: 14:56
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {

            while (true) {
                list.add(Integer.parseInt(reader.readLine()));
            }

        } catch (Exception e) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }

    }
}
