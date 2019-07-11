package traycatchrangaci;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GetTesting {
    private static ArrayList list = new ArrayList();

    public static void main(String[] args) throws IOException {
        int x, y;
        double d1, d2;

        System.out.println("Please insert integer: ");
        x = Get.Int();
        System.out.println("Please insert integer in range between -10 and 10: ");
        y = Get.Int(-10, 10);
        System.out.println("Amazing!\n x = " + x + " y = " + y);
        System.out.println();
        System.out.println("Please insert a double value: ");
        d1 = Get.Double();
        System.out.println("Please insert double value between 0.5 and 25.5: ");
        d2 = Get.Double(0.5, 25.5);
        System.out.println("Amazing!\n d1 = " + d1 + " d2 = " + d2);

        list.add(x);
        list.add(y);
        list.add(d1);
        list.add(d2);


        Get.printArrayValues(list);


    }

}
//dorabotati class GetTesting: obiaviti massiv i s klaviatury vesti znacenie elementov
