package io.codelex.generics.practice.exercise2;


import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        Object listObjects = list.get(0);
        if (listObjects instanceof String) {
            result = "String: ";
            separator = " ";
        } else if (listObjects instanceof Integer) {
            result = "Integers: ";
            separator = "+";
        } else {
            result = listObjects.getClass().getSimpleName() + ": ";
            separator = "&";
        }
        result = result + list.stream().map(Object::toString).collect(Collectors.joining(separator));
        return result;
    }
}
