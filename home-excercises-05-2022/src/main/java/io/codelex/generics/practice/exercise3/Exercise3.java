package io.codelex.generics.practice.exercise3;

import java.util.List;

public class Exercise3 {

    public <T> void add(T value, List<? super T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) l.add(el);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) l.add(el);
    }
}
