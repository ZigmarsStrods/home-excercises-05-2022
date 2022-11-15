package io.codelex.oop.exercise09.loops.practice;

public class Vowels {

    //TODO: print all vowels using for and foreach
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.print("Printed using for: ");
        //todo - use for
        for (int i = 0; i < vowels.length; i++) {
            System.out.print(vowels[i]);
        }
        System.out.print("\nPrinted using foreach: ");

        //todo - use foreach
        for (char vowel : vowels) {
            System.out.print(vowel);
        }

    }

}
