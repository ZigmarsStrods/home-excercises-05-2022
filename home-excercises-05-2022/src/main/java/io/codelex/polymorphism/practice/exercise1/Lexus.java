package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, NitrousOxideEngine {
    private Integer currentSpeed = 0;

    private Integer speedChange = 8;

    public void speedUp() {
        currentSpeed += speedChange;
    }

    public void slowDown() {
        currentSpeed -= speedChange;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }
}
