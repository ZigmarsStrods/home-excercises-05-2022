package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    private static final int speedUpTimes = 10;
    private static final int nitroTimes = 3;

    public static void main(String[] args) {


        List<Car> myCarList = new ArrayList<>();
        myCarList.add(new Audi());
        myCarList.add(new Bmw());
        myCarList.add(new Lexus());
        myCarList.add(new Nikola());
        myCarList.add(new Pobeda());
        myCarList.add(new Tesla());

        for (int i = 1; i <= speedUpTimes; i++) {
            myCarList.forEach(Car::speedUp);
            if (i % nitroTimes == 0) {
                myCarList.stream()
                        .filter(s -> s instanceof NitrousOxideEngine)
                        .forEach(s -> ((NitrousOxideEngine) s).useNitrousOxideEngine());
            }
        }

        Car fastestCar = myCarList.stream()
                .max(Comparator.comparing(s -> Integer.parseInt(s.showCurrentSpeed())))
                .get();
        System.out.println("Fastest car was: " + fastestCar.getClass().getSimpleName() + " with speed " + fastestCar.showCurrentSpeed());
    }
}
