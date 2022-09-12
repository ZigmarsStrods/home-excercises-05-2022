package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Please enter Your maximal FizzBuzz number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            StringBuilder outputStr = new StringBuilder("");
            if (i % 3 == 0) {
                outputStr.append("Fizz");
            }
            if (i % 5 == 0) {
                outputStr.append("Buzz");
            }
            if (outputStr.toString().equals("")) {
                outputStr.append(i);
            }
            outputStr.append(" ");
            if (i % 20 == 0) {
                outputStr.append("\n");
            }
            System.out.print(outputStr);
        }
    }
}
