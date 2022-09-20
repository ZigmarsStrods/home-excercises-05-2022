package io.codelex.classesandobjects.practice.exercise6;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return Math.floor(numberSurveyed * PURCHASED_ENERGY_DRINKS);

    }

    public static double calculatePreferCitris(int numberSurveyed) {
        return Math.floor(calculateEnergyDrinkers(numberSurveyed) * PREFER_CITRUS_DRINKS);

    }

}
