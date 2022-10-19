package io.codelex.collections.practice.exercise4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        boolean moreNames = true;
        Scanner input = new Scanner(System.in);
        Set<String> nameSet = new LinkedHashSet<>();
        while (moreNames) {
            System.out.print("Enter name: ");
            String nextName = input.nextLine();
            if (nextName.equals("")) {
                moreNames = false;
            } else {
                nameSet.add(nextName);
            }
        }
        System.out.print("Unique name list contains:");
        nameSet.forEach(element -> System.out.print(" " + element));
    }
}
