package io.codelex.classesandobjects.practice.date;

public class DateApp {
    public static void main(String[] args) {

        Date myDate = new Date(20, 9, 2022);
        System.out.println("The date is: " + myDate.getDay() + "." + myDate.getMonth() + "." + myDate.getYear());
        myDate.setDay(21);
        myDate.setMonth(10);
        myDate.setYear(2023);
        myDate.displayDate();
    }
}
