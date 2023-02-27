package AdvancedLiveCodingex8;

import java.util.Comparator;

public enum Car implements Comparable<Car> {
    FERRARI(50.505, 740, true),
    PORSCHE(40.503, 550, true),
    MERCEDES(30.540, 250, true),
    BMW(30.540, 265, true),
    OPEL(17.550, 140, false),
    FIAT(15.850, 77, false),
    TOYOTA(18.500, 125, false);

    private final double price;
    private final int power;

    private final boolean isPremium;

    Car(double price, int power, boolean isPremium) {
        this.price = price;
        this.power = power;
        this.isPremium = isPremium;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public boolean isRegular() {
        return !isPremium;
    }

    public boolean isFasterThan(Car car) {
        return car.power > this.power;
    }

    public boolean compareToOtherCar(Car car){
        return compareToOtherCar(car);
    }
}
