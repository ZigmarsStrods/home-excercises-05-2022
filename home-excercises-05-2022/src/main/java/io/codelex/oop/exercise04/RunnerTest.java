package io.codelex.oop.exercise04;

import java.util.Scanner;

public class RunnerTest {
    public static void main(String[] args) {
        System.out.println("Please enter how fast You run the marathon in minutes: ");
        Scanner input = new Scanner(System.in);
        double time = input.nextDouble();
        Runner runnerType = Runner.getFitnessLevel(time);
        System.out.println("Your fitness level is " + runnerType);
    }
}
