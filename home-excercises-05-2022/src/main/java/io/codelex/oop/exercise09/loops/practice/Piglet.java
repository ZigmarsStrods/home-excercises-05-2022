package io.codelex.oop.exercise09.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        Random diceGen = new Random();
        Scanner input = new Scanner(System.in);
        int diceRoll;
        int sum = 0;
        boolean rollAgain = true;
        while (rollAgain) {
            diceRoll = diceGen.nextInt(6) + 1;
            System.out.println("You have rolled a " + diceRoll + "!");
            if (diceRoll == 1) {
                sum = 0;
                break;
            }
            sum += diceRoll;
            System.out.print("Roll again?");
            rollAgain = isPositiveAnswer(input.next());
        }
        System.out.println("You got " + sum + " points");
    }

    private static boolean isPositiveAnswer(String answer) {
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }
}
