package io.codelex.exceptions.practice.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Integer numerator = null;
        Integer divisor = null;
        while (true) {
            try {
                System.out.println("Enter the numerator: ");
                String stringToCheckForQuit = scanner.next();
                if (stringToCheckForQuit.toLowerCase().startsWith("q")) {
                    break;
                } else {
                    numerator = Integer.parseInt(stringToCheckForQuit);
                }
                System.out.println("Enter the divisor: ");
                divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Please enter Integer to get the calculation result! Previous input generated error: " + e);
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Can't be divided by Zero " + e);
                scanner.nextLine();
            }
        }
    }
}
