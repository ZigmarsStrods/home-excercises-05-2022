package io.codelex.typesandvariables.practice;

import java.util.Scanner;


public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Please enter minutes for conversion to years and days: ");
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
        int years = 0;
        while (minutes >= 525600) {
            minutes -= 525600;
            years++;
            if (years % 4 == 0 && minutes >= 1440) {
                minutes -= 1440;
            } else if (years % 4 == 0) {
                years--;
                minutes += 525600;
                break;
            }
        }
        int days = minutes / 1440;
        System.out.println("Your minutes convert to " + years + " years and " + days + " days.");
    }
}
