package io.codelex.oop.summary.generics.exercise2;

import java.math.BigDecimal;
import java.util.Locale;

public class ItemPacking implements Service {

    private static final String name = "Item packing";
    private static final BigDecimal price = new BigDecimal(5);

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String fullInfo() {
        return String.format(Locale.ROOT, name + ", %.2f EUR", price);
    }
}
