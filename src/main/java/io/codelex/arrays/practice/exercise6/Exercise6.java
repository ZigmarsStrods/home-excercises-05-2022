package io.codelex.arrays.practice.exercise6;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random gen = new Random();
        int arrSize = 10;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = gen.nextInt(100) + 1;
        }
        int[] arrCopied = Arrays.copyOf(arr, arrSize);
        arr[arrSize - 1] = -7;
        StringBuilder parsedArr = new StringBuilder();
        StringBuilder parsedClonedArr = new StringBuilder();
        for (int i = 0; i < arrSize; i++) {
            parsedArr.append(arr[i]).append(" ");
            parsedClonedArr.append(arrCopied[i]).append(" ");
        }
        System.out.println("Elements of array 1 are: " + parsedArr);
        System.out.println("Elements of array 2 are: " + parsedClonedArr);
    }
}
