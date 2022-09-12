package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        System.out.println("Plese enter number for pyrimid steps: ");
        Scanner input = new Scanner(System.in);
        int constant = input.nextInt();
        StringBuilder stars = new StringBuilder();
        for (int j = 0; j < constant; j++) {
            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();
            for (int i = 1; i < constant - j; i++) {
                left.append("////");
                right.append("\\\\\\\\");
            }
            System.out.println(left.append(stars).append(right));
            stars.append("********");


        }

    }
}
