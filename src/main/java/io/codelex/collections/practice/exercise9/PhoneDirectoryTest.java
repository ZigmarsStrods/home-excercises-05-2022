package io.codelex.collections.practice.exercise9;

public class PhoneDirectoryTest {

    public static void main(String[] args) {

        PhoneDirectory myPhoneDirectory = new PhoneDirectory();

        String name1 = "Zigmārs";
        String number1 = "22222222";
        String number2 = "11111111";
        myPhoneDirectory.putNumber(name1, number1);
        System.out.println(name1 + " number is " + myPhoneDirectory.getNumber(name1));
        myPhoneDirectory.putNumber(name1, number2);
        System.out.println(name1 + " number is " + myPhoneDirectory.getNumber(name1));
        String name2 = "Martins";
        myPhoneDirectory.putNumber(name2, number2);
        System.out.println(name2 + " number is " + myPhoneDirectory.getNumber(name2));
        myPhoneDirectory.putNumber(name2, number1);
        System.out.println(name2 + " number is " + myPhoneDirectory.getNumber(name2));
        String name3 = "Jānis";
        String number3 = "33333333";
        System.out.println(name3 + " number is " + myPhoneDirectory.getNumber(name3));
        myPhoneDirectory.putNumber(name3, number3);
        System.out.println(name3 + " number is " + myPhoneDirectory.getNumber(name3));
    }
}
