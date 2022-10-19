package io.codelex.collections.practice.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> newList = new ArrayList<>();
        //TODO: Add 10 values to list
        for (int i = 'A'; i < 'A' + 10; i++) {
            newList.add(Character.toString(i));
        }
        //TODO: Add new value at 5th position
        newList.add(4, "Foobar");
        //TODO: Change value at last position (Calculate last position programmatically)
        int lastPosition = newList.size() - 1;
        newList.set(lastPosition, "Changed value");
        //TODO: Sort your list in alphabetical order
        Collections.sort(newList);
        //TODO: Check if your list contains "Foobar" element
        String stringToCheck = "Foobar";
        if (newList.contains(stringToCheck)) {
            System.out.println("The list contains " + stringToCheck);
        }
        //TODO: Print each element of list using loop
        for (String element : newList) {
            System.out.println(element);
        }
    }

}
