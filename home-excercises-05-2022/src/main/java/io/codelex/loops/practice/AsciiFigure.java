package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    private static final String leftDashes = "////";
    private static final String rightDashes = "\\\\\\\\";
    private static final String starString = "********";

    public static void main(String[] args) {
        System.out.println("Plese enter number for pyrimid steps: ");
        Scanner input = new Scanner(System.in);
        int constant = input.nextInt();
        StringBuilder stars = new StringBuilder();
        for (int j = 0; j < constant; j++) {
            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();
            for (int i = 1; i < constant - j; i++) {
                left.append(leftDashes);
                right.append(rightDashes);
            }
            System.out.println(left.append(stars).append(right));
            stars.append(starString);


        }

    }
}
