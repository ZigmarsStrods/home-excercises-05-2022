package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed = 0;

    private final Integer speedChange = 20;
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
        System.out.println("-- silence ---");
    }
}
