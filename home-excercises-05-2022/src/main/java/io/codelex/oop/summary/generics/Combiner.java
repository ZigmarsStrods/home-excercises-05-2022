package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Combiner {

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public static <A, B> String combineTwoItems(A first, B second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

    public static void main(String[] args) {

        System.out.println(combineTwoItems(new Object(), "Two"));

    }

}
