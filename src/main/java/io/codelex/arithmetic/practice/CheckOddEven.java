package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println("Please enter Your integer number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("It is odd number.");
        } else {
            System.out.println("It is even number.");
        }
        System.out.println("Bye!");
    }
}
