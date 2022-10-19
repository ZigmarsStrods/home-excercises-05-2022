package io.codelex.oop.exercise05;

public enum ConversionType {

    METERS_TO_YARDS(1.0936133, "yards"),
    YARDS_TO_METERS(0.9144, "meters"),
    CENTIMETERS_TO_ICHES(0.393700787, "inches"),
    INCHES_TO_CENTIMETERS(2.54, "centimeters"),
    KILOMETERS_TO_MILES(0.62137119, "miles"),
    MILES_TO_KILOMETERS(1.609344, "kilometers");

    private double converter;

    private String units;

    private ConversionType(double converter, String units) {
        this.converter = converter;
        this.units = units;
    }

    public double getConverter() {
        return converter;
    }

    public String getUnits() {
        return units;
    }
}
