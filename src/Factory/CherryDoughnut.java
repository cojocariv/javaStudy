package Factory;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 01.04.19
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */
public class CherryDoughnut implements Doughnut{
    @Override
    public void eat(){
        System.out.println("You are eating Cherry doughnut!");
    }
}
