package io.codelex.classesandobjects.practice.exercise3;

public class Odometer {

    public final int MAX_MILEAGE = 999999;
    private int mileage = 0;

    public int getMileage() {

        return mileage;
    }

    public void mileageIncrease(FuelGauge gauge) {
        if (mileage < MAX_MILEAGE) {
            mileage++;
            System.out.println("The car mileage now is " + mileage + " km.");
            decreaseFuel(gauge);
        } else {
            mileage = 0;
            System.out.println("The car mileage is reset to zero!");
        }
    }

    private void decreaseFuel(FuelGauge gauge) {
        if (mileage % 10 == 0) {
            gauge.burnOneLiter();
        } else {
            System.out.println("The car tank now has " + gauge.getFuelAmount() + " l.");
        }

    }

}
