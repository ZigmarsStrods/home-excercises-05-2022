package io.codelex.oop.summary.generics.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<SellableThing> sellableList;

    public Order() {
        sellableList = new ArrayList<>();
    }

    public void addItem(SellableThing thingToAdd) {
        LocalDate now = LocalDate.now();
        if (thingToAdd instanceof FoodItem && ((FoodItem) thingToAdd).getDateOfExpiration().isBefore(now)) {
            throw new BadFoodException("Can not add the food that has expired to the order");
        }
        sellableList.add(thingToAdd);
    }

    public String returnList() {
        return sellableList.toString();
    }

    public List<SellableThing> getSellableList() {
        return sellableList;
    }
}
