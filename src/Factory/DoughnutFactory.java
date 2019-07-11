package Factory;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 01.04.19
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */
public class DoughnutFactory {
    private Integer cherryDoughnutCount = 0;
    private Integer chocolateDoughnutCount = 0;
    private Integer almondDoughnutCount = 0;

    public Doughnut getDoughnut(DoughtnutTypes type) {
        Doughnut toReturn = null;
        switch (type) {
            case CHERRY:
                cherryDoughnutCount++;
                toReturn = new CherryDoughnut();
                break;
            case CHOCOLATE:
                chocolateDoughnutCount++;
                toReturn = new ChocholateDought();
                break;
            case ALMOND:
                almondDoughnutCount++;
                toReturn = new AlmondDought();
                break;
            default:
                throw new IllegalArgumentException("Wrong dought type:" + type);
        }
        return toReturn;
    }

    public void printCount() {
        System.out.println("Number of doughnuts produced (by type):");
        System.out.println("Cherry doughnuts: " + cherryDoughnutCount);
        System.out.println("Chocolate doughnuts: " + chocolateDoughnutCount);
        System.out.println("Almond doughnuts: " + almondDoughnutCount);
        System.out.println("Total: " + (cherryDoughnutCount + chocolateDoughnutCount + almondDoughnutCount));
    }
}


