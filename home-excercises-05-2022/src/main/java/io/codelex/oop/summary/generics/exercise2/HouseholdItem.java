package io.codelex.oop.summary.generics.exercise2;

import java.math.BigDecimal;

public class HouseholdItem extends AbstractItem {

    private String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + " color: " + color;
    }
}
