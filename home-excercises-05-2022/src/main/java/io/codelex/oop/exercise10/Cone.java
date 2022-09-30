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
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}
