package io.codelex.typesandvariables.practice;

import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Please enter the distance in meters:");
        Scanner input = new Scanner(System.in);
        double distance = input.nextDouble();
        System.out.println("Please enter hours:");
        double hours = input.nextDouble();
        System.out.println("Please enter minutes:");
        double minutes = input.nextDouble();
        System.out.println("Please enter seconds:");
        double seconds = input.nextDouble();
        double speedMeterSec = distance / (seconds + 60 * (minutes + 60 * hours));
        double speedKmHours = speedMeterSec * 3.6;
        double speedMilesHours = speedKmHours * 0.621371192;
        System.out.printf(Locale.ROOT, "The speed of movement was %.8fm/s.\n", speedMeterSec);
        System.out.printf(Locale.ROOT, "The speed of movement was %.8fkm/h.\n", speedKmHours);
        System.out.printf(Locale.ROOT, "The speed of movement was %.8f miles/h.\n", speedMilesHours);

    }
}
