package io.codelex.collections.practice.exercise1;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> arrList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrList);
        //todo - replace array with a HashSet and print out the results
        Set<String> arrAsSet = new HashSet<>(Arrays.asList(array));
        System.out.println(arrAsSet);
        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> arrAsMap = new HashMap<>();
        for (String element : array) {
            if (element.equals("Honda")) {
                arrAsMap.put(element, "Japan");
            } else if (element.equals("Tesla")) {
                arrAsMap.put(element, "USA");
            } else {
                arrAsMap.put(element, "Germany");
            }
        }
        System.out.println(arrAsMap);
    }
}
