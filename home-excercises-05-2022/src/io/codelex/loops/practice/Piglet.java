package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        Random diceGen = new Random();
        Scanner input = new Scanner(System.in);
        int diceRoll;
        int sum = 0;
        String rollAgain = "y";
        while (rollAgain.toLowerCase().equals("y") || rollAgain.toLowerCase().equals("yes")) {
            diceRoll = diceGen.nextInt(6) + 1;
            System.out.println("You have rolled a " + diceRoll + "!");
            if (diceRoll == 1) {
                sum = 0;
                break;
            }
            sum += diceRoll;
            System.out.print("Roll again?");
            rollAgain = input.next();
        }
        System.out.println("You got "+sum+" points");
    }
}
