package io.codelex.arithmetic.practice;


import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Please enter Your weight in kg: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble() * 2.20462262; //in pounds
        System.out.println("Please enter Your height in cm: ");
        double height = input.nextDouble() * 0.393700787; //in inches;
        double bmi = weight * 703 / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("You are underweight!");
        } else if (bmi < 25) {
            System.out.println("You have optimal weight!");
        } else {
            System.out.println("You are overweight!");
        }
    }
}
