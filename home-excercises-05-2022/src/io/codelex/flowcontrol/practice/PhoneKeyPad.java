package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        System.out.println("Please enter text for the number conversion: ");
        Scanner input = new Scanner(System.in);
        String str = input.next().toLowerCase();
        StringBuilder output = new StringBuilder("");
        /* WITHOUT LOOP:
        String output = str.replaceAll("[abc]", "2")
                .replaceAll("[def]", "3")
                .replaceAll("[ghi]", "4")
                .replaceAll("[jkl]", "5")
                .replaceAll("[mno]", "6")
                .replaceAll("[pqrs]", "7")
                .replaceAll("[tuv]", "8")
                .replaceAll("[wxyz]", "9");*/

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                System.out.println("Illegal characters entered!!!");
                return;
            } else if (str.charAt(i) <= 'c') {
                output.append(2);
            } else if (str.charAt(i) <= 'f') {
                output.append(3);
            } else if (str.charAt(i) <= 'i') {
                output.append(4);
            } else if (str.charAt(i) <= 'l') {
                output.append(5);
            } else if (str.charAt(i) <= 'o') {
                output.append(6);
            } else if (str.charAt(i) <= 's') {
                output.append(7);
            } else if (str.charAt(i) <= 'v') {
                output.append(8);
            } else {
                output.append(9);
            }
        }

        System.out.println("Your text converted to number: " + output);
    }
}
