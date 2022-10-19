package io.codelex.flowcontrol.practice;


import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        System.out.println("Please enter the day number in week: ");
        Scanner input = new Scanner(System.in);
        int dayNumber = input.nextInt();
        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a valid day!");
        }
    }
}
