package io.codelex.oop.exercise05;

import java.util.Scanner;

public class MeasurementConverterTest {

    public static void main(String[] args) {
        System.out.println("Please enter the value for conversion: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        input.nextLine();
        System.out.println("Please enter the conversion type: ");
        ConversionType necessaryConversion = ConversionType.valueOf(input.nextLine());
        double result = MeasurementConverter.convert(value, necessaryConversion);
        System.out.println("The result of Your conversion is: " + result + " " + necessaryConversion.getUnits());
    }
}
