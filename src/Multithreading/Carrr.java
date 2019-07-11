package Multithreading;

public class Carrr implements Comparable<Carrr>{
    private final String carBrand;
    private final String model;
    private final int pricePerDay;

    public Carrr(String carBrand, String model, int pricePerDay) {
        this.carBrand = carBrand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getModel() {
        return model;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Carrr car = (Carrr) obj;
        if (!this.carBrand.equals(car.getCarBrand())) {
            return false;
        }
        if (!this.model.equals(car.getModel())) {
            return false;
        }
        return this.pricePerDay == car.getPricePerDay();
    }

    @Override
    public int compareTo(Carrr o) {
        return 0;
    }
}
