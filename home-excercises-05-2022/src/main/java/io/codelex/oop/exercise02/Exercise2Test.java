package io.codelex.oop.exercise02;

import java.time.LocalDate;

public class Exercise2Test {


    public static void main(String[] args) {

        Employee testEmployee = new Employee("Zigmārs", "Strods", "123", 37, "Programmer", LocalDate.of(2020, 07, 11));
        System.out.println("Work experience: " + testEmployee.getWorkExperience());
        System.out.println("All info: " + testEmployee.getInfo());

        Customer testCustomer = new Customer("Ainārs", "Šlesers", "007", 61, "0001", 77);
        System.out.println("Purchase count: " + testCustomer.getPurchaseCount());
        testCustomer.setPurchaseCount(111);
        System.out.println("Purchase count 111: " + testCustomer.getPurchaseCount());
        System.out.println("All info: " + testCustomer.getInfo());
    }

}
