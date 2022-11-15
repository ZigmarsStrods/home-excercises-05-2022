package io.codelex.oop.exercise01;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public Double getPerimeter() {
        System.out.println("Too less information to get correct value!");
        return null;
    }
}
