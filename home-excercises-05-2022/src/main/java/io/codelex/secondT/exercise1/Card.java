package io.codelex.secondT.exercise1;

import java.math.BigDecimal;

public abstract class Card {

    private final long number;
    private final String owner;
    private final String CCV;
    private BigDecimal balance;

    public Card(long number, String owner, String CCV, double balance) {
        this.number = number;
        this.owner = owner;
        this.CCV = CCV;
        this.balance = BigDecimal.valueOf(balance);
    }

    public void add(double moneyToAdd) {
        balance = balance.add(new BigDecimal(moneyToAdd));
    }


    public void withdraw(double moneyToTake) {
        if (balance.compareTo(new BigDecimal(moneyToTake)) < 0) {
            throw new NotEnoughFundsException("Not enough funds");

        } else {
            balance = balance.subtract(new BigDecimal(moneyToTake));
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

}


