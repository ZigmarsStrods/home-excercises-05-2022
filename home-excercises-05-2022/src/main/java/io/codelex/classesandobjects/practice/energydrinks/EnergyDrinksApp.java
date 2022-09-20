package io.codelex.classesandobjects.practice.energydrinks;

public class EnergyDrinksApp {

    public static void main(String[] args) {
        int surveyedPeople = EnergyDrinks.NUMBERED_SURVEYED;
        System.out.println("Total number of people surveyed " + surveyedPeople);
        System.out.printf("Approximately %.0f bought at least one energy drink.\n", calculateEnergyDrinkers(surveyedPeople));
        System.out.printf("%.0f of those " + "prefer citrus flavored energy drinks.", calculatePreferCitris(surveyedPeople));
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return Math.floor(numberSurveyed * EnergyDrinks.PURCHASED_ENERGY_DRINKS);

    }

    public static double calculatePreferCitris(int numberSurveyed) {
        return Math.floor(calculateEnergyDrinkers(numberSurveyed) * EnergyDrinks.PREFER_CITRUS_DRINKS);

    }
}
