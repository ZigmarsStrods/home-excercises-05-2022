package io.codelex.arithmetic.practice;

import java.util.Locale;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerBound = 1;
        int upperBound = 2;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = ((double) sum) / (upperBound - lowerBound + 1);
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + sum);
        System.out.printf(Locale.ROOT, "The average is %.1f\n", average);
    }
}
