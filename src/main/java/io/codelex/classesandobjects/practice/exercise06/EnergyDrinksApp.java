package io.codelex.classesandobjects.practice.exercise06;

public class EnergyDrinksApp {

    public static void main(String[] args) {
        int surveyedPeople = EnergyDrinks.NUMBERED_SURVEYED;
        System.out.println("Total number of people surveyed " + surveyedPeople);
        System.out.printf("Approximately %.0f bought at least one energy drink.\n", EnergyDrinks.calculateEnergyDrinkers(surveyedPeople));
        System.out.printf("%.0f of those " + "prefer citrus flavored energy drinks.", EnergyDrinks.calculatePreferCitrus(surveyedPeople));
    }


}
