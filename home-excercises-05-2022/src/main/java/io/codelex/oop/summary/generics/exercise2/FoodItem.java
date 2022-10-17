package io.codelex.oop.summary.generics.exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {

    private LocalDate dateOfExpiration;

    public FoodItem(String name, double price, LocalDate dateOfExpiration) {
        super(name, price);
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + " best before: " + dateOfExpiration;
    }


}
