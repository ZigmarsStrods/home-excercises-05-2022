package io.codelex.classesandobjects.practice.exercise02;

import java.util.Locale;
import java.util.Scanner;

public class Car {

    private double startKilometers;
    private double endKilometers;
    private double liters = 0;

    public Car() {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);

        System.out.print("Enter the initial odometer reading: ");
        startKilometers = scan.nextDouble();
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
            return this.calculateConsumption() > 15.0;
        }
    }

    public Boolean isEconomyCar() {
        if (this.calculateConsumption() == 0) {
            return null;
        } else {
            return this.calculateConsumption() < 5.0;
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
