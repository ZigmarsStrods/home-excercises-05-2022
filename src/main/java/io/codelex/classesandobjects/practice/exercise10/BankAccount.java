package io.codelex.classesandobjects.practice.exercise10;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.util.Locale;

public class BankAccount {

    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        if (balance < 0) {
            return String.format(Locale.ROOT, name + ", -$%.2f", Math.abs(balance));
        } else {
            return String.format(Locale.ROOT, name + ", $%.2f", balance);
        }
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

}
