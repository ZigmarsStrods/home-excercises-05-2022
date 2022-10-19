package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2App {

    public static void main(String[] args) {

        List<String> oneWord = new ArrayList<>();
        oneWord.add("Word to test");
        System.out.println(Exercise2.concatenate(oneWord));

        List<Integer> oneInteger = new ArrayList<>();
        oneInteger.add(1);
        System.out.println(Exercise2.concatenate(oneInteger));

        List<Object> oneObject = new ArrayList<>();
        oneObject.add(new Object());
        System.out.println(Exercise2.concatenate(oneObject));
    }
}
