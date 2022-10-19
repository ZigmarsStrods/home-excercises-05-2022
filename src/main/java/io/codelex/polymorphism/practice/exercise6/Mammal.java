package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class Mammal extends Animal {

    private String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormatSymbols symbolFormat = new DecimalFormatSymbols(Locale.ROOT);
        DecimalFormat myFormatter = new DecimalFormat("###.##", symbolFormat);
        return "[" + super.getAnimalName() + ", " + myFormatter.format(super.getAnimalWeight()) + ", "
                + livingRegion + ", " + super.getFoodEaten() + "]";
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            super.setFoodEaten(food.getQuantity());
        } else {
            System.out.println(super.getAnimalType() + " is not eating that type of food!");
        }
    }
}
