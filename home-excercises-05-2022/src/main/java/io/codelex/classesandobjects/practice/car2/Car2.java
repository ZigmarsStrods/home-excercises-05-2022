package io.codelex.classesandobjects.practice.car2;

public class Car2 {
    public static void main(String[] args) {
        FuelGauge gauge = new FuelGauge();
        Odometer odo = new Odometer();
        while (gauge.getFuelAmount() < gauge.MAX_FUEL_AMOUNT) {
            gauge.fillOneLiter();
        }
        System.out.println("--------------------------------------------------------");
        while (gauge.getFuelAmount() > 0) {
            odo.mileageIncrease(gauge);
        }
    }
}
