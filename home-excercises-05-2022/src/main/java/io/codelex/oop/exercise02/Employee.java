package io.codelex.oop.exercise02;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        Period workExperiencePeriod = Period.between(startedWorking, LocalDate.now());
        return workExperiencePeriod.getYears();
    }

    public String getInfo() {
        return position + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + " years)";
    }
}
