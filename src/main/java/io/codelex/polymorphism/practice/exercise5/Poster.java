package io.codelex.polymorphism.practice.exercise5;

import java.math.BigDecimal;

public class Poster extends Advert {

    private double area;
    private int copies;
    private BigDecimal costPerCopy;


    public Poster(int fee, double area, int copies, double costPerCopy) {
        super(fee);
        this.area = area;
        this.copies = copies;
        this.costPerCopy = BigDecimal.valueOf(costPerCopy);
    }

    @Override
    public int cost() {
        return BigDecimal.valueOf(super.cost()).add(BigDecimal.valueOf(copies).multiply(costPerCopy)).intValue();
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: Area=" + area +
                " Copies=" + copies +
                " CostPerCopy=" + costPerCopy;
    }
}

