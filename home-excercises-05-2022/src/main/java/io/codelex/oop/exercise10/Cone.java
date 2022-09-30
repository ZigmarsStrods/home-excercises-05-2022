package io.codelex.oop.exercise10;

public class Cone extends ThreeDShape {

    private int radius;
    private int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * piMultilyByRadius();
    }

    @Override
    public double calculateArea() {
        return piMultilyByRadius() * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public double calculateVolume() {
        return (piMultilyByRadius() * radius * height) / 3;
    }

    private double piMultilyByRadius() {
        return Math.PI * radius;
    }

}
