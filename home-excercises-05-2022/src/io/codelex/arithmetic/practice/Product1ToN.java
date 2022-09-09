package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Product1ToN {
    public static void main(String[] args) {
        System.out.println("Enter number for the factorial:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(recursiveFactorial(num));

    }

    public static int recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        ;
        return recursiveFactorial(n - 1) * n;
    }
}
