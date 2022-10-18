package io.codelex.oop.summary.generics.exercise2;

import javax.swing.text.DateFormatter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem {

    private LocalDate dateOfExpiration;
    DateTimeFormatter invDateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public FoodItem(String name, double price, LocalDate dateOfExpiration) {
        super(name, price);
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + " best before: " + dateOfExpiration.format(invDateFormat);
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }
}
