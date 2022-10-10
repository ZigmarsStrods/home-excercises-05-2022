package io.codelex.polymorphism.practice.exercise1;

public class Nikola implements Car {

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 0;
    }

    public void slowDown() {
        currentSpeed -= 0;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Pleas roll me down the hill");
    }
}
