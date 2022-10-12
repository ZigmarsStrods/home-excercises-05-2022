package io.codelex.generics.practice.exercise2;


import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static String concatenate(List<String> list) {
        String result = "";
        String separator = "";
        if (list instanceof List<String>) {
            result = "String: ";
            separator = " ";
        } else if (list instanceof List<String>) {
            result = "Integers: ";
            separator = "+";
        }
        result = result + list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(separator))
                .toString();
        return result;
    }
}
