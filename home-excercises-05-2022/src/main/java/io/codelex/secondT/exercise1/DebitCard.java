package io.codelex.secondT.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(long number, String owner, String CCV, double balance) {
        super(number, owner, CCV, balance);
    }

    @Override
    public void add(double moneyToAdd) {
        super.add(moneyToAdd);
        if (getBalance().compareTo(new BigDecimal("10000")) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
