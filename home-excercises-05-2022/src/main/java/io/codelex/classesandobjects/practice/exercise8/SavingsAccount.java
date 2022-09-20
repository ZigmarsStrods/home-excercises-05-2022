package io.codelex.classesandobjects.practice.exercise8;

import java.math.BigDecimal;
import java.math.MathContext;

public class SavingsAccount {

    private BigDecimal annualInterestRate = BigDecimal.ZERO;
    private BigDecimal balance;

    public SavingsAccount(BigDecimal startingBalance) {
        this.balance = startingBalance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdrawal(BigDecimal withdraw) {
        balance = balance.subtract(withdraw);
    }

    public void depositing(BigDecimal deposit) {
        balance = balance.add(deposit);
    }

    public BigDecimal addInterest() {
        BigDecimal monthlyInterestRate = annualInterestRate.divide(new BigDecimal("1200"), MathContext.DECIMAL128);
        BigDecimal interest = balance.multiply(monthlyInterestRate);
        balance = balance.add(interest);
        return interest;
    }
}