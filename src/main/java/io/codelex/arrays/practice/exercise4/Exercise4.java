package io.codelex.arrays.practice.exercise4;

public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };


        //fixme - check if contains number 1245
        int lookupValue = 2455;
        for (int number : myArray) {
            if (number == lookupValue) {
                System.out.println("The array contains value " + lookupValue + ".");
                return;
            }
        }
        System.out.println("The array does not contain value " + lookupValue + ".");
    }
}
