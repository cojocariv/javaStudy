import sun.text.bidi.BidiRun;

/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 13.03.19
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 */
public class Truck {
    int length;
    int width;
    int height;
    int weight;

    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }

    public static void main(String[] args) {
        Truck first = new Truck();
        first.weight = 10000;
        Truck second = new Truck();
        second.weight = 20000;

        BridgeOfficer officer = new BridgeOfficer(150000);
        System.out.println("Грузовик номер 1! Могу я проехать, офицер?");
        boolean canFirsTruckGo = officer.checkTruck(first);
        System.out.println(canFirsTruckGo);

        System.out.println("Грузовик номер 2! А мне можно?");
        boolean canSecondTruckGo = officer.checkTruck(second);
        System.out.println(canSecondTruckGo);
    }
}


