package io.codelex.dateandtime.practice.exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePeriodTest {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 10);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 15);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        if (overlap == null) {
            System.out.println("There is no intersection between these 2 time periods!");
        } else {
            System.out.println("Overlap period is from " + overlap.getStart().format(formatter) + " till " + overlap.getEnd().format(formatter) + ".");
        }
    }
}
