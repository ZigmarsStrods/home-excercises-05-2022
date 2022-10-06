package io.codelex.collections.practice.exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Please enter Your integer number: ");
        Scanner input = new Scanner(System.in);
        int number = Math.abs(input.nextInt());
        int numToCheck = number;
        while (true) {
            int sum = Arrays.stream(Integer.toString(numToCheck).split(""))
                    .mapToInt(digit -> Integer.parseInt(digit) * Integer.parseInt(digit))
                    .sum();
            if (sum == 1) {
                System.out.println(number + " is happy! :)");
                break;
            } else if (sum == 4 || sum == 0) {
                System.out.println(number + " is not happy! :(");
                break;
            } else {
                numToCheck = sum;
            }
        }
    }
}
