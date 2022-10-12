package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MyGenericList<T> {

    List<T> genericList = new ArrayList<>();

    public void add(int i, T el) {

        genericList.add(i, el);

    }

    public T get(int i) {
        return genericList.get(i);
    }
}
