package io.codelex.dateandtime.practice.exercise4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise4Test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Please enter the starting date in format dd.MM.yyyy: ");
        Scanner input = new Scanner(System.in);
        LocalDate startDate = LocalDate.parse(input.nextLine(), formatter);
        LocalDate next13th = DateTimeExercise.findNextFriday13th(startDate);
        System.out.println("Next Friday 13TH will be on " + next13th.format(formatter));

    }
}
