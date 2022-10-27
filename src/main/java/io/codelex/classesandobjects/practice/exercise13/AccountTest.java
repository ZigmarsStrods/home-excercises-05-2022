package io.codelex.classesandobjects.practice.exercise13;

public class AccountTest {
    public static void main(String[] args) {

        Account newAccount = new Account("Zigmārs", 100.0);
        newAccount.deposit(20.0);
        System.out.println(newAccount);

        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattAccount);
        System.out.println(myAccount);
        System.out.println("-----Test3-----");
        Account accountA = new Account("A", 100.0);
        Account accountB = new Account("B", 0.0);
        Account accountC = new Account("C", 0.0);
        Account.transfer(accountA, accountB, 50.0);
        Account.transfer(accountB, accountC, 25.0);
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }
}
