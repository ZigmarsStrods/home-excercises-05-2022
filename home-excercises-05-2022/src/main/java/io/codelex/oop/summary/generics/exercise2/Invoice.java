package io.codelex.oop.summary.generics.exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

public class Invoice {

    private List<SellableThing> itemList;
    private String invoiceNumber;
    private InvoiceStatus status;
    private BigDecimal price;
    private BigDecimal priceVAT;

    public Invoice(String invoiceNumber, Order inputOrder) {
        itemList = inputOrder.getSellableList();
        if (itemList.size() == 0) {
            throw new WrongOrderException("Can not create invoice with an empty order");
        }
        this.invoiceNumber = invoiceNumber;
        status = InvoiceStatus.APPROVED;
        price = itemList.stream()
                .map(SellableThing::getPrice)
                .reduce(BigDecimal.valueOf(0), BigDecimal::add);
        priceVAT = price.multiply(BigDecimal.valueOf(1.21));

    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    public String invoiceInfo() {
        return "=".repeat(53)
                + stringFormat("INVOICE NUMBER: " + invoiceNumber)
                + stringFormat("STATUS: " + status)
                + itemList.stream()
                .map(i -> itemList.indexOf(i) + 1 + ". " + i.fullInfo())
                .map(Invoice::stringFormat)
                .collect(Collectors.joining(""))
                + stringFormat("SUM: " + price + " EUR")
                + stringFormat("VAT (21%): " + priceVAT.subtract(price).setScale(2, RoundingMode.UP) + " EUR")
                + stringFormat("TOTAL: " + priceVAT.setScale(2, RoundingMode.UP) + " EUR") +
                "\n" + "=".repeat(53);

    }

    private static String stringFormat(String str) {
        return String.format("\n= %-50s=", str);
    }
}
