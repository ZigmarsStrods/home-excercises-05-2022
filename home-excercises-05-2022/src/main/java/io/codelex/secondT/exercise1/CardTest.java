package io.codelex.secondT.exercise1;


public class CardTest {
    public static void main(String[] args) {

        CreditCard myCreditCard = new CreditCard(1, "Es", "267", 50);
        myCreditCard.add(69);
        System.out.println(myCreditCard.getBalance());
        myCreditCard.withdraw(50.0);
        System.out.println(myCreditCard.getBalance());
        //myCreditCard.withdraw(1000);


    }
}
