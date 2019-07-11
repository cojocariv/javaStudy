package Factory;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 01.04.19
 * Time: 15:12
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        DoughnutFactory factory2 = new DoughnutFactory();
        for (int i = 0; i < 10; i++) {
            eatRandomDoughnut(factory2);
        }

               factory2.printCount();
    }



    public static void eatRandomDoughnut(DoughnutFactory factory) {
        Doughnut randomDoughnut = getRandomDoughnut(factory);
        System.out.printf("What a surprise!");
        randomDoughnut.eat();
    }

    public static Doughnut getRandomDoughnut(DoughnutFactory factory) {
        Random random = new Random();
        DoughtnutTypes type = DoughtnutTypes.values()[random.nextInt(DoughtnutTypes.values().length)];
        return (factory.getDoughnut(type));
    }
}
