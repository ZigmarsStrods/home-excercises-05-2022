package io.codelex.dateandtime.practice.exercise2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise2 {

    public static final int daysBetweenRestarts = 14;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter fullDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Please enter the date when server was launched in format dd.MM.yyyy: ");
        LocalDate launchDate = LocalDate.parse(input.nextLine(), fullDateFormatter);
        System.out.println("Please enter the year when restart should be done in format yyyy: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Please enter the month when restart should be done (as example: September): ");
        String monthString = input.nextLine()
                .toUpperCase();
        Month month = Month.valueOf(monthString);
        LocalDate firstDayOfMonthInterested = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonthInterested = firstDayOfMonthInterested.plusMonths(1)
                .minusDays(1);
        long days = ChronoUnit.DAYS.between(launchDate, lastDayOfMonthInterested);
        long dayOffset = days % daysBetweenRestarts;
        LocalDate possibleRestartDate = lastDayOfMonthInterested.minusDays(dayOffset);
        System.out.println("Necessary restart dates in " + month + " " + year + " are:");
        LocalDate restartDate = null;
        while (possibleRestartDate.compareTo(launchDate) > 0 && possibleRestartDate.compareTo(firstDayOfMonthInterested) >= 0) {
            restartDate = possibleRestartDate;
            System.out.println(restartDate.format(fullDateFormatter));
            possibleRestartDate = restartDate.minusDays(daysBetweenRestarts);
        }
        if (restartDate == null) {
            System.out.println("NONE!?!");
        }
    }
}
