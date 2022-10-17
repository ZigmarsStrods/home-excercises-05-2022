package io.codelex.oop.summary.generics.exercise1;

import java.io.LineNumberReader;
import java.util.function.Supplier;

public class LazyBox<T> {

    private final Supplier<T> innerFunction;
    private T value;

    LazyBox(Supplier<T> innerFunction) {
        this.innerFunction = innerFunction;
    }

    public T get() {
        if (value == null) {
            value = innerFunction.get();
        }
        return value;
    }
}
