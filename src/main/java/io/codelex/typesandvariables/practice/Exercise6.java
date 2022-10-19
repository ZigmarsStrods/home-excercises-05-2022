package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Please enter a serie of SINGLE digit numbers (press ENTER after each number or E to finish the number input): ");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (input.hasNextLine()) {
            String in = input.nextLine();
            if (in.equals("E")) {
                break;
            } else if (in.matches(".*[^\\d].*") || Math.abs(Integer.parseInt(in)) > 9) {
                System.out.println("Illegal input! Please enter a single digit number!");
            } else {
                sum += Integer.parseInt(in);
            }
        }
        System.out.println("Sum of numbers You entered is: " + sum);
    }


}
