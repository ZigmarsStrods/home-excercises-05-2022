package io.codelex.dateandtime.practice.exercise4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        LocalDate next13thToCheck = LocalDate.of(from.getYear(), from.getMonth(), 13);

        if (from.getDayOfMonth() >= 13) {
            next13thToCheck = getNext13th(next13thToCheck);
        }
        while (next13thToCheck.getDayOfWeek() != DayOfWeek.FRIDAY) {
            next13thToCheck = getNext13th(next13thToCheck);
        }
        return next13thToCheck;
    }

    private static LocalDate getNext13th(LocalDate current13thDate) {
        return current13thDate.plusMonths(1);
    }
}


