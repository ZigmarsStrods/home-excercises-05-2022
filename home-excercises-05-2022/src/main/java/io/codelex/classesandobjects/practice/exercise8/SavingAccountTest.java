package io.codelex.classesandobjects.practice.exercise8;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class SavingAccountTest {
    public static void main(String[] args) {
        System.out.println("How much money was in the account initally? ");
        Scanner input = new Scanner(System.in);
        BigDecimal initialMoney = input.nextBigDecimal();
        SavingsAccount myAccount = new SavingsAccount(initialMoney);
        System.out.println("Enter the annual interest rate: ");
        BigDecimal interestRate = input.nextBigDecimal();
        myAccount.setAnnualInterestRate(interestRate);
        System.out.println("For how long has the account been opened?");
        int months = input.nextInt();
        BigDecimal monthlyDeposit = BigDecimal.ZERO;
        BigDecimal monthlyWithdrawal = BigDecimal.ZERO;
        BigDecimal monthlyInterest = BigDecimal.ZERO;
        BigDecimal totalDeposited = BigDecimal.ZERO;
        BigDecimal totalWithdrawn = BigDecimal.ZERO;
        BigDecimal interestEarned = BigDecimal.ZERO;
        for (int i = 1; i <= months; i++) {
            System.out.println("Enter amount deposited for month: " + i + " : ");
            monthlyDeposit = input.nextBigDecimal();
            myAccount.depositing(monthlyDeposit);
            totalDeposited = totalDeposited.add(monthlyDeposit);
            System.out.println("Enter amount withdrawn for month: " + i + " : ");
            monthlyWithdrawal = input.nextBigDecimal();
            myAccount.withdrawal(monthlyWithdrawal);
            totalWithdrawn = totalWithdrawn.add(monthlyWithdrawal);
            monthlyInterest = myAccount.addInterest();
            interestEarned = interestEarned.add(monthlyInterest);
        }
        System.out.printf(Locale.ROOT, "Total deposited: $%,.2f\n", totalDeposited);
        System.out.printf(Locale.ROOT, "Total withdrawn: $%,.2f\n", totalWithdrawn);
        System.out.printf(Locale.ROOT, "Interest earned: $%,.2f\n", interestEarned);
        System.out.printf(Locale.ROOT, "Ending balance: $%,.2f", myAccount.getBalance());
    }
}
