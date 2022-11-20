package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListImplementingMyListInterface implements MyListInterface {

    private final List<Integer> integerList = new ArrayList<>();

    @Override
    public void add(int i, Object number) {
        integerList.add(i, (Integer) number);

    }

    public Object get(int i) {
        return integerList.get(i);
    }


}
