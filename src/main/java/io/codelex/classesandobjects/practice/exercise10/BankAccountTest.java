package io.codelex.classesandobjects.practice.exercise10;


public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Zigmārs", -17.5);
        System.out.println(myAccount.toString());
        double mydeposit = 10;
        myAccount.deposit(mydeposit);
        System.out.println("After " + mydeposit + " deposit: " + myAccount.toString());
        double mywithdrawal = 200;
        myAccount.withdraw(mywithdrawal);
        System.out.println("After " + mywithdrawal + " withdrawal: " + myAccount.toString());
    }
}
