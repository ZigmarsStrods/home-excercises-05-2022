package io.codelex.secondT;

import java.util.function.BiFunction;

public class Combiner<A, B> {

    A one;

    B two;
    BiFunction<A, B, String> toString;

    public Combiner(A one, B two, BiFunction<A, B, String> toString) {

        this.toString = toString;
        this.one = one;
        this.two = two;
    }

    public String combine() {
        return toString.apply(one, two);
    }
}

