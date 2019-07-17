package InnerClasses;

public class Main {
    public static void main(String[] args) {
        Bicycle peugeot = new Bicycle("Peugeot", 120);
        Bicycle.SteeringWheel wheel = peugeot.new SteeringWheel();
        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();
        peugeot.start();
        wheel.left();
        wheel.right();
MonitoringSystem monitoringSystem = new MonitoringSystem() {
    @Override
    public void implementMonitoring() {
        System.out.println("asd");
    }
};

monitoringSystem.implementMonitoring();

    }
}
