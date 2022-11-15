package io.codelex.oop.summary.generics.exercise2;

import java.math.BigDecimal;
import java.util.Locale;

public abstract class AbstractItem implements Item {

    private BigDecimal price;
    private String name;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = BigDecimal.valueOf(price);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String fullInfo() {
        return String.format(Locale.ROOT, name + ", %.2f EUR,", price);
    }
}
