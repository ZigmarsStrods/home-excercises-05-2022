package io.codelex.oop.exercise09;

public class RegularHexagon extends Shape {

    private int side;

    public RegularHexagon(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (3*Math.sqrt(3)*side*side)/2;

    }

    @Override
    public double calculatePerimeter() {
        return 6*side;
    }
}
