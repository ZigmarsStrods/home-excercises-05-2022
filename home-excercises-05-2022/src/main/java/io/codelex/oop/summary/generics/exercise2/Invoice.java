package io.codelex.oop.summary.generics.exercise2;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Invoice {

    private List<Item> itemList;
    private String invoiceNumber;
    private InvoiceStatus status;
    private BigDecimal price;
    private BigDecimal priceVAT;

    public Invoice(String invoiceNumber, Order inputOrder) {
        this.invoiceNumber = invoiceNumber;
        status = InvoiceStatus.APPROVED;
        itemList = inputOrder.getItemList();
        price = itemList.stream().map(Item::getPrice).reduce(BigDecimal.valueOf(0), BigDecimal::add);
        priceVAT = price.multiply(BigDecimal.valueOf(1.21));

    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    public String invoiceInfo() {
        return "=".repeat(53) + stringFormat("INVOICE NUMBER: " + invoiceNumber)
                + stringFormat("STATUS: " + status)
                + itemList.stream()
                .map(Item::fullInfo)
                .map(i -> itemList.indexOf(i)+i)
                .map(Invoice::stringFormat)
                .collect(Collectors.joining(""));

    }

    private static String stringFormat(String str) {
        return String.format("\n= %-50s=", str);
    }
}
