package io.codelex.polymorphism.practice.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class DragRaceTest {

    String[] carsToTest = {"Audi", "Bmw", "Lexus", "Nikola", "Pobeda", "Tesla"};

    @Test
    void checkCarSpeedIncrease() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        for (String car : carsToTest) {
            //Given
            Class carClass = Class.forName("io.codelex.polymorphism.practice.exercise1." + car);
            Constructor carConstructor = carClass.getConstructor();
            Car myTestCar = (Car) carConstructor.newInstance();
            //WHEN
            myTestCar.speedUp();
            String testCarSpeed = myTestCar.showCurrentSpeed();
            Field speedChangeField = carClass.getDeclaredField("speedChange");
            speedChangeField.setAccessible(true);
            //THEN
            Assertions.assertEquals(speedChangeField.get(myTestCar).toString(), testCarSpeed);
        }
    }
}
