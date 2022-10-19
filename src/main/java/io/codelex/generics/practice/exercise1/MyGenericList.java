package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MyGenericList<E> {

    List<E> genericList = new ArrayList<>();

    public void add(int i, E el) {

        genericList.add(i, el);

    }

    public E get(int i) {
        return genericList.get(i);
    }
}
