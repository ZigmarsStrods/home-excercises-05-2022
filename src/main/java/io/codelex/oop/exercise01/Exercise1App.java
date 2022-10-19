package io.codelex.oop.exercise01;

import java.util.Scanner;

public class Exercise1App {

    public static void main(String[] args) {

        System.out.println("Enter width of rectangle: ");
        Scanner input = new Scanner(System.in);
        double rectangleWidth = input.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double rectangleHeight = input.nextDouble();
        Rectangle myRectangle = new Rectangle(rectangleWidth, rectangleHeight);
        double myRectangleArea = myRectangle.getArea();
        double myRectanglePerimeter = myRectangle.getPerimeter();
        System.out.println("Your rectangle has area " + myRectangleArea + " and perimeter " + myRectanglePerimeter);
        System.out.println("Enter base of triangle: ");
        double triangleBase = input.nextDouble();
        System.out.println("Enter height of triangle: ");
        double triangleHeight = input.nextDouble();
        Triangle myTriangle = new Triangle(triangleBase, triangleHeight);
        double myTriangleArea = myTriangle.getArea();
        Double myTrianglePerimeter = myTriangle.getPerimeter();
        System.out.println("Your triangle has area " + myTriangleArea + ", but too less information to determine perimeter!");

    }
}
