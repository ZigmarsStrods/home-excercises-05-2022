package io.codelex.classesandobjects.practice.exercise03;

public class FuelGauge {

    public final int MAX_FUEL_AMOUNT = 70;
    private int fuelAmount = 0;

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void fillOneLiter() {
        if (fuelAmount < MAX_FUEL_AMOUNT) {
            fuelAmount++;
            System.out.println("The car tank now has " + fuelAmount + " l.");
        } else {
            System.out.println("The car tank is already full and You can not fill it more!");
        }
    }

    public void burnOneLiter() {
        if (fuelAmount > 0) {
            fuelAmount--;
            System.out.println("The car tank now has " + fuelAmount + " l.");
        } else {
            System.out.println("The car tank is completely empty. Please fill it!");
        }
    }

}
