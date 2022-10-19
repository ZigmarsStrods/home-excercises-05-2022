package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomNum = generator.nextInt(100) + 1;
        System.out.println("Please try to guess the generated integer from 1 till 100: ");
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        if (userNum > randomNum) {
            System.out.println("Too high! The correct number was " + randomNum);
        } else if (userNum < randomNum) {
            System.out.println("Too low! The correct number was " + randomNum);
        } else {
            System.out.println("A Miracle! You have guessed the number!");
        }
    }
}
