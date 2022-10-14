package io.codelex.secondT.exercise3;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<E> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }


    public String join(E... elements) {
        return Arrays.stream(elements).map(Object::toString).collect(Collectors.joining(separator));

    }
}
