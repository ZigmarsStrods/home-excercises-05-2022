package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Locale;

class Employee {
    String name;
    BigDecimal basePay;
    BigDecimal hoursWorked;

    public Employee(String name, double basePay, int hoursWorked) {
        this.basePay = new BigDecimal(basePay);
        this.hoursWorked = new BigDecimal(hoursWorked);
        this.name = name;
    }

    public static void totalPay(Employee worker) {
        if (worker.basePay.intValue() < 8 || worker.hoursWorked.intValue() > 60) {
            System.out.println("Please check the employee data as there is some error!!!");
        }
        if (worker.hoursWorked.intValue() <= 40) {
            System.out.printf(Locale.ROOT, worker.name + " total pay is $%.2f.\n", worker.hoursWorked.multiply(worker.basePay));
        } else {
            System.out.printf(Locale.ROOT, worker.name + " total pay is $%.2f.\n", worker.hoursWorked.multiply(BigDecimal.valueOf(1.5)).subtract(BigDecimal.valueOf(20)).multiply(worker.basePay));

        }
    }


    public static void main(String[] args) {
        totalPay(new Employee("Zigmārs Strods", 8, 35));
        totalPay(new Employee("Employee2", 8.2, 47));
        totalPay(new Employee("Employee3", 10, 53));
    }
}
