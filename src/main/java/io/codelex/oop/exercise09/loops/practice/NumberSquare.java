package io.codelex.oop.exercise09.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        System.out.println("Please enter smallest integer: ");
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        System.out.println("Please enter the largest integer: ");
        int max = input.nextInt();
        int initialMin = min;
        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                System.out.printf("%4d", j);
            }
            for (int k = initialMin; k < min; k++) {
                System.out.printf("%4d", k);
            }
            min++;
            System.out.println();
        }
    }
}
