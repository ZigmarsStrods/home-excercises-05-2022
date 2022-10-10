package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger makes sound");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            super.setFoodEaten(food.getQuantity());
        } else {
            System.out.println(super.getAnimalType() + " is not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return "Tiger" + super.toString();
    }
}

