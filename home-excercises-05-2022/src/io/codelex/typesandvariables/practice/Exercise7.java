package io.codelex.typesandvariables.practice;


import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Please enter Your text:");
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().replaceAll("[^A-Z]", "").split("");
        int count;
        if (str[0].equals("")) {
            count = 0;
        } else {
            count = str.length;
        }
        System.out.println("You entered " + count + " uppercase letters.");
    }
}
