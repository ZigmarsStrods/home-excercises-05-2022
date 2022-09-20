package io.codelex.classesandobjects.practice.car;

public class LitersPerKilometer {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("Liters per 100km are " + car.calculateConsumption());
        double fillAmount = 15.1;
        car.fillUp(200, fillAmount);
        System.out.println("Upon odometer reading " + car.getEndKilometers() + " km and last fillup for " +
                fillAmount + " liters, the fuel comnsumption of the car was " + car.calculateConsumption() +
                " liters per 100 km.");
        fillAmount = 15.1;
        car.fillUp(300, fillAmount);
        System.out.println("Upon odometer reading " + car.getEndKilometers() + " km and last fillup for " +
                fillAmount + " liters, the fuel comnsumption of the car was " + car.calculateConsumption() +
                " liters per 100 km.");
        if (car.isGasHog()) {
            System.out.println("Your car is a fuel cemetery!");
        } else if (car.isEconomyCar()) {
            System.out.println("You think green with Your economy car!");
        }
        Car car2 = new Car();
        fillAmount = 15.1;
        car2.fillUp(1000, fillAmount);
        System.out.println("Upon odometer reading " + car2.getEndKilometers() + " km and last fillup for " +
                fillAmount + " liters, the fuel comnsumption of the car was " + car2.calculateConsumption() +
                " liters per 100 km.");
        if (car2.isGasHog()) {
            System.out.println("Your car is a fuel cemetery!");
        } else if (car2.isEconomyCar()) {
            System.out.println("You think green with Your economy car!");
        }
    }
}

