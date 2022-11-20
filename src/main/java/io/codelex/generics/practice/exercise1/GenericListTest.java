package io.codelex.generics.practice.exercise1;

public class GenericListTest {

    public static void main(String[] args) {

        MyGenericList<String> stringList = new MyGenericList<>();
        stringList.add(0, "Test");
        System.out.println(stringList.get(0));

    }
}
