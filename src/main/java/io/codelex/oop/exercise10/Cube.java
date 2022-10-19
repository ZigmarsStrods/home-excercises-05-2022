package io.codelex.oop.exercise10;

public class Cube extends ThreeDShape {

    private int side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}
