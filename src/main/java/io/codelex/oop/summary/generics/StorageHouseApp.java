package io.codelex.oop.summary.generics;

public class StorageHouseApp {

    public static void main(String[] args) {

        StorageHouse<Object> objectStorage = new StorageHouse<>(new Object());
        System.out.println(objectStorage.getMaybeFirstItem());
        objectStorage.addMoreItems(new Object());
        objectStorage.printItems();

    }
}
