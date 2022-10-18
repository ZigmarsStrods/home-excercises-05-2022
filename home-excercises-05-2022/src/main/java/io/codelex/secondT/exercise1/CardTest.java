package io.codelex.secondT.exercise1;


public class CardTest {
    public static void main(String[] args) {

        CreditCard myCreditCard = new CreditCard(1, "Es", "267", 50);
        myCreditCard.add(69);
        System.out.println(myCreditCard.getBalance());
        myCreditCard.withdraw(50);
        System.out.println(myCreditCard.getBalance());
        //myCreditCard.withdraw(1000);
        DebitCard myDebitCard = new DebitCard(1, "Es", "267", 50);
        myDebitCard.add(11000);
        System.out.println(myDebitCard.getBalance());
        myDebitCard.withdraw(9000);
        System.out.println(myDebitCard.getBalance());
        //myCreditCard.withdraw(10000);


    }
}
