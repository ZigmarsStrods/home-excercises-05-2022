package io.codelex.polymorphism.practice.exercise6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class AnimalApp {

    private static final Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Animal> myAnimalList = new ArrayList<>();
        while (true) {
            System.out.println("Please enter the details for Your animal: ");
            String animalType = input.next();
            if (animalType.equals("End")) {
                break;
            }
            String animalName = input.next();
            Double animalWeight = input.nextDouble();
            String animalLivingRegion = input.next();
            Class animalClass = Class.forName("io.codelex.polymorphism.practice.exercise6." + animalType);
            Animal enteredAnimal;
            if (animalType.equals("Cat")) {
                String catBreed = input.next();
                Constructor catConstructor = animalClass.getConstructor(String.class, String.class, Double.class, String.class, String.class);
                enteredAnimal = (Cat) catConstructor.newInstance(animalType, animalName, animalWeight, animalLivingRegion, catBreed);
            } else {
                Constructor animalConstructor = animalClass.getConstructor(String.class, String.class, Double.class, String.class);
                enteredAnimal = (Animal) animalConstructor.newInstance(animalType, animalName, animalWeight, animalLivingRegion);
            }
            input.nextLine();
            String foodType = input.next();
            int foodQuantity = input.nextInt();
            input.nextLine();
            Class foodClass = Class.forName("io.codelex.polymorphism.practice.exercise6." + foodType);
            Constructor foodConstructor = foodClass.getConstructor(Integer.class);
            Food enteredFood = (Food) foodConstructor.newInstance(foodQuantity);
            enteredAnimal.eat(enteredFood);
            enteredAnimal.makeSound();
            System.out.println(enteredAnimal.toString());
            myAnimalList.add(enteredAnimal);

        }
        String forPrint = myAnimalList.stream()
                .map(Animal::toString)
                .collect(Collectors.joining(", "))
                .toString();
        System.out.println(forPrint);

    }


}
