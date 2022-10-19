package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Please enter the 1st integer:");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.println("Please enter the 2nd integer:");
        int secondNum = input.nextInt();
        System.out.println(firstNum == 15 || secondNum == 15 || firstNum + secondNum == 15 ||
                Math.abs(firstNum - secondNum) == 15);
    }
}
