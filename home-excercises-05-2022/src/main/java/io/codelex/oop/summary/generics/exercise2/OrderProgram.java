package io.codelex.oop.summary.generics.exercise2;

import java.time.LocalDate;

public class OrderProgram {

    public static void main(String[] args) {

        LocalDate  bestBefore = LocalDate.of(2023, 4, 1);
        FoodItem foodItem1 = new FoodItem("Milk", 0.75, bestBefore);
        ElectronicsItem electronics1 = new ElectronicsItem("Radio", 25, 100);
        HouseholdItem householdItem1 = new HouseholdItem("Bucket", 5, "red");
        Order firstOrder = new Order();
        firstOrder.addItem(foodItem1);
        firstOrder.addItem(electronics1);
        firstOrder.addItem(householdItem1);
        Invoice firstInvoice = new Invoice("INV123", firstOrder);
        System.out.println(firstInvoice.invoiceInfo());
    }
}
