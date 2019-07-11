package BuilderPattern;

public class Director {


}

enum Transmission {
    MANUAL, AUTO;
}

class Car {
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
class CarBuilder{
    String m;
    Transmission t;
    int s;



}