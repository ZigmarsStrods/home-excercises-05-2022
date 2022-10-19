package io.codelex.secondT.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(long number, String owner, String CCV, double balance) {
        super(number, owner, CCV, balance);
    }


    public void withdraw(double moneyToTake) {
        super.withdraw(moneyToTake);
        if (getBalance().compareTo(new BigDecimal("100")) < 0) {
            System.out.println("Warning: Low funds");
        }
    }
}
