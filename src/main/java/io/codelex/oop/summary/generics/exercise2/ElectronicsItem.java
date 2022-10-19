package io.codelex.oop.summary.generics.exercise2;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {

    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + " power: " + power + "W";
    }
}
