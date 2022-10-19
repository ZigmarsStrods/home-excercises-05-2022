package io.codelex.oop.exercise10;

import java.util.Locale;

public class ThreeDShapeTest {
    public static void main(String[] args) {

        Cone myCone = new Cone(5, 10);
        System.out.printf(Locale.ROOT, "Cone surface area: %.2f\n", myCone.calculateArea());
        System.out.printf(Locale.ROOT, "Cone base perimeter: %.2f\n", myCone.calculatePerimeter());
        System.out.printf(Locale.ROOT, "Cone volume: %.2f\n", myCone.calculateVolume());

        Cube myCube = new Cube(7);
        System.out.printf(Locale.ROOT, "Cube surface area: %.2f\n", myCube.calculateArea());
        System.out.printf(Locale.ROOT, "Cube base perimeter: %.2f\n", myCube.calculatePerimeter());
        System.out.printf(Locale.ROOT, "Cube volume: %.2f\n", myCube.calculateVolume());

    }
}
