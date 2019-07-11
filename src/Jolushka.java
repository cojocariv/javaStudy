import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * Порядок объявления списков очень важен.
 * 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 * 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 */

public class Jolushka {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listTop = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> listNone = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            try {
                listTop.add(Integer.parseInt(reader.readLine()));
            } catch (NumberFormatException e) {
                System.out.println("Nu este numar");
                i--;
                continue;
            }
        }
        for (int i = 0; i < listTop.size(); i++) {
            if (listTop.get(i) % 3 == 0 && listTop.get(i) % 2 == 0) {
                list2.add(listTop.get(i));
                list3.add(listTop.get(i));
            } else if (listTop.get(i) % 3 == 0 && listTop.get(i) % 2 != 0) {
                list3.add(listTop.get(i));
            } else if (listTop.get(i) % 2 == 0 && listTop.get(i) % 3 != 0) {
                list2.add(listTop.get(i));
            } else {
                listNone.add(listTop.get(i));
            }
        }
        printList(list3);
        printList(list2);
        printList(listNone);


    }

    public static void printList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
