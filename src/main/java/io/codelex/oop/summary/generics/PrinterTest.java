package io.codelex.oop.summary.generics;

public class PrinterTest {

    public static void main(String[] args) {

        Printer<String> stringPrint = new Printer<>("Text to print");
        stringPrint.print();
        System.out.println(stringPrint.getThingToPrint());

        Printer<Object> objPrint = new Printer<>(new Object());
        objPrint.print();
        System.out.println(objPrint.getThingToPrint());
    }
}
