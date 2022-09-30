package io.codelex.oop.exercise05;

public class MeasurementConverter {

    public static double convert(int value, ConversionType conversionType) {
        return value * conversionType.getConverter();
    }
}
