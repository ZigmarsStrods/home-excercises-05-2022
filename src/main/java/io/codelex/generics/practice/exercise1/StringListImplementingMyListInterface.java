package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StringListImplementingMyListInterface implements MyListInterface {

    private final List<String> integerList = new ArrayList<>();

    @Override
    public void add(int i, Object number) {
        integerList.add(i, (String) number);

    }

    public Object get(int i) {
        return integerList.get(i);
    }
}
