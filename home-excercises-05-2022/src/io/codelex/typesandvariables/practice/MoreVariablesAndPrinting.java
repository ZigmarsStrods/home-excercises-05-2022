package io.codelex.typesandvariables.practice;

import java.util.Locale;

public class MoreVariablesAndPrinting {

    public static void main(String[] args) {
        String name = "Zed A. Shaw";
        int age = 35;
        double height = 74 * 2.54;  // in centimeters
        double weight = 180 * 0.453592; // in kilos
        String eyes = "blue";
        String teeth = "white";
        String hair = "brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.printf(Locale.ROOT, "He's %.2f centimeters tall.\n", height);
        System.out.printf(Locale.ROOT, "He's %.2f kilos heavy.\n", weight);
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.printf(Locale.ROOT, "If I add " + age + ", %.2f and %.2f I get %.2f.", height, weight, age + height + weight);
    }
}