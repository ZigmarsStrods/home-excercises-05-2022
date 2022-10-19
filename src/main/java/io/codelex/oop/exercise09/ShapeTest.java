package io.codelex.oop.exercise09;

import java.util.Locale;

public class ShapeTest {
    public static void main(String[] args) {

        int myRectangleWidth = 5;
        int myRectangleLength = 5;
        Rectangle myRectangle = new Rectangle(myRectangleWidth, myRectangleLength);
        System.out.println("Rectangle area: " + myRectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + myRectangle.calculatePerimeter());

        int myTriangleSideOne = 6;
        int myTriangleSideTwo = 6;
        int myTriangleSideThree = 6;
        Triangle myTriangle = new Triangle(myTriangleSideOne, myTriangleSideTwo, myTriangleSideThree);
        System.out.printf(Locale.ROOT, "Triangle area: %.2f\n", myTriangle.calculateArea());
        System.out.println("Triangle perimeter: " + myTriangle.calculatePerimeter());

        int hexagonSide = 7;
        RegularHexagon myHexagon = new RegularHexagon(hexagonSide);
        System.out.printf(Locale.ROOT, "Regular hexagon area: %.2f\n", myHexagon.calculateArea());
        System.out.println("Regular hexagon perimeter: " + myHexagon.calculatePerimeter());


    }
}
