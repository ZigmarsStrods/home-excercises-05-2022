package io.codelex.dateandtime.practice.exercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise1 {

    public static final int workingHoursPerDay = 8;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Please enter the first date dd.MM.yyyy: ");
        LocalDate firstDate = LocalDate.parse(input.nextLine(), formatter);
        int firstWeekDayValue = firstDate.getDayOfWeek()
                .getValue();
        System.out.println("Please enter the second date dd.MM.yyyy: ");
        LocalDate secondDate = LocalDate.parse(input.nextLine(), formatter);
        int secondWeekDayValue = secondDate.getDayOfWeek()
                .getValue();
        long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        long workingDays = days - 2 * (days / 7);
        if (days % 7 != 0) {
            if (firstWeekDayValue == 7 || secondWeekDayValue == 7) {
                workingDays--;
            } else if (secondWeekDayValue < firstWeekDayValue) {
                workingDays -= 2;
            }
        }
        long workingHours = workingDays * workingHoursPerDay;
        System.out.println("From " + firstDate.format(formatter) + "(inclusive) till " + secondDate.format(formatter) + "(exclusive) there are " + workingHours + " working hours.");
    }
}
