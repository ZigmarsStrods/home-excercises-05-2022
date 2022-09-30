package io.codelex.dateandtime.practice.exercise3;

import java.time.LocalDate;
import java.util.Date;

public class DatePeriod {

    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {

        DatePeriod intersectionPeriod = intersectionIfSecondPeriodEndBetweenFirstPeriodDates(secondPeriod);
        if (intersectionPeriod == null) {
            intersectionPeriod = intersectionIfSecondPeriodEndAfterFirstPeriodEnd(secondPeriod);
        }
        return intersectionPeriod;

    }

    private DatePeriod intersectionIfSecondPeriodEndBetweenFirstPeriodDates(DatePeriod secondPeriod) {
        if (secondPeriod.getEnd().compareTo(start) > 0 && secondPeriod.getEnd().compareTo(end) <= 0) {
            LocalDate intesectionStart = start;
            LocalDate intersectionEnd = secondPeriod.getEnd();
            if (secondPeriod.getStart().compareTo(start) >= 0) {
                intesectionStart = secondPeriod.getStart();
            }
            return new DatePeriod(intesectionStart, intersectionEnd);
        } else {
            return null;
        }
    }

    private DatePeriod intersectionIfSecondPeriodEndAfterFirstPeriodEnd(DatePeriod secondPeriod) {
        if (secondPeriod.getEnd().compareTo(end) > 0 && secondPeriod.getStart().compareTo(end) < 0) {
            LocalDate intesectionStart = secondPeriod.getStart();
            LocalDate intersectionEnd = end;
            if (secondPeriod.getStart().compareTo(start) < 0) {
                intesectionStart = start;
            }
            return new DatePeriod(intesectionStart, intersectionEnd);
        } else {
            return null;
        }
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }
}
