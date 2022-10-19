package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number for multiply: ");
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        int output = i;
        System.out.print("Input number of terms: ");
        n = in.nextInt();


        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (int itr = 0; itr < n; itr++) {
            System.out.println(output *= i);
        }

    }

}
