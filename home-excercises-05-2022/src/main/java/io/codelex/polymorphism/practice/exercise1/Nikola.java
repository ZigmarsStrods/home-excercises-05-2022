package io.codelex.polymorphism.practice.exercise1;

public class Nikola implements Car {

    private Integer currentSpeed = 0;

    private Integer speedChange = 0;

    public void speedUp() {
        currentSpeed += speedChange;
    }

    public void slowDown() {
        currentSpeed -= speedChange;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Pleas roll me down the hill");
    }
}
