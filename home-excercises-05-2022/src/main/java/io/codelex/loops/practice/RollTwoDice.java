package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;


public class RollTwoDice {

    private static final Random gen = new Random();

    public static void main(String[] args) {
        System.out.print("Please enter Your desired sum: ");
        Scanner input = new Scanner(System.in);
        int desired = input.nextInt();

        int firstNum;
        int secNum;
        int sum;
        do {
            firstNum = rollDice();
            secNum = rollDice();
            sum = firstNum + secNum;
            System.out.println(firstNum + " and " + secNum + " = " + sum);
        } while (desired != sum);
    }

    private static int rollDice() {
        return gen.nextInt(6) + 1;
    }
}
