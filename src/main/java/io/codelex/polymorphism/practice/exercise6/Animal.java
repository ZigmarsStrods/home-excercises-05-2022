package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class Animal {

    private final String animalType;
    private String animalName;
    private double animalWeight;

    private int foodEaten = 0;

    public Animal(String animalType, String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;

    }

    @Override
    public String toString() {
        DecimalFormatSymbols symbolFormat = new DecimalFormatSymbols(Locale.ROOT);
        DecimalFormat myFormatter = new DecimalFormat("###.##", symbolFormat);
        return "[" + animalName + ", " + myFormatter.format(animalWeight) + ", " + foodEaten + "]";
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}
