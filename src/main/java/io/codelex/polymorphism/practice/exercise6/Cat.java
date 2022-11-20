package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat makes sound");
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormatSymbols symbolFormat = new DecimalFormatSymbols(Locale.ROOT);
        DecimalFormat myFormatter = new DecimalFormat("###.##", symbolFormat);
        return "Cat[" + super.getAnimalName() + ", " + breed + ", "
                + myFormatter.format(super.getAnimalWeight()) + ", "
                + super.getLivingRegion() + ", " + super.getFoodEaten() + "]";
    }
}
