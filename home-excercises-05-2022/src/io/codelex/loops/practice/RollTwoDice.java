package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;


public class RollTwoDice {
    public static void main(String[] args) {
        System.out.print("Please enter Your desired sum: ");
        Scanner input = new Scanner(System.in);
        int desired = input.nextInt();
        Random gen = new Random();
        int firstNum;
        int secNum;
        int sum;
        do {
            firstNum = gen.nextInt(6) + 1;
            secNum = gen.nextInt(6) + 1;
            sum = firstNum + secNum;
            System.out.println(firstNum + " and " + secNum + " = " + sum);
        } while (desired != sum);
    }
}
