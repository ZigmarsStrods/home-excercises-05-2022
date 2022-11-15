package io.codelex.classesandobjects.practice.exercise02;

public class Car {

    private final double GAS_HOG_CONSUMPTION_THRESHOLD = 15;
    private final double ECONOMY_CAR_CONSUMPTION_THRESHOLD = 5;
    private final double startKilometers;
    private double endKilometers;
    private double liters = 0;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        endKilometers = startKilometers;
    }

    public double calculateConsumption() {
        if (liters == 0 || startKilometers == endKilometers) {
            System.out.println("Before calculation please enter the tank fillup info and odometer reading after the driving!");
            return 0;
        } else {
            return (liters * 100) / (endKilometers - startKilometers);
        }
    }

    public Boolean isGasHog() {
        if (this.calculateConsumption() == 0) {
            return null;
        } else {
            return this.calculateConsumption() > GAS_HOG_CONSUMPTION_THRESHOLD;
        }
    }

    public Boolean isEconomyCar() {
        if (this.calculateConsumption() == 0) {
            return null;
        } else {
            return this.calculateConsumption() < ECONOMY_CAR_CONSUMPTION_THRESHOLD;
        }
    }

    public void fillUp(int mileage, double liters) {
        endKilometers = mileage;
        this.liters += liters;
    }

    public double getEndKilometers() {
        return endKilometers;
    }

}
