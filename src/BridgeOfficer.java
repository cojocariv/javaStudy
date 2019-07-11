/**
 * Created with IntelliJ IDEA.
 * User: cojocari
 * Date: 13.03.19
 * Time: 12:04
 * To change this template use File | Settings | File Templates.
 */
public class BridgeOfficer {
    int maxWeight;

    public BridgeOfficer(int normalVolume) {
        this.maxWeight = normalVolume;
    }

    public boolean checkTruck(Truck truck) {

        if (truck.weight > maxWeight) {
            return false;
        } else {
            return true;
        }
    }
}
