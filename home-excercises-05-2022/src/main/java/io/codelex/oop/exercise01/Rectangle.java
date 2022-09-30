package io.codelex.oop.exercise01;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (width + height);
    }
}
