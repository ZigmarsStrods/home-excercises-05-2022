package io.codelex.oop.summary.generics.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> itemList;

    public Order() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item itemToAdd) {
        itemList.add(itemToAdd);
    }

    public String returnList() {
        return itemList.toString();
    }

    public List<Item> getItemList() {
        return itemList;
    }
}
