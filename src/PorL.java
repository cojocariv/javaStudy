import java.util.ArrayList;
import java.util.stream.Collectors;

public class PorL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> fix(ArrayList<String> list) {
                //напишите тут ваш код
                // remove entry if it contains "р" but no "л"
        list.removeIf(s -> (s.contains("р")) && !(s.contains("л")));
                 // add entry if it contains "л" but no "р"
        list.addAll(list.stream()
                .filter(s -> s.contains("л") && !(s.contains("р")))
                .collect(Collectors.toList()));
        return list;
    }
}
