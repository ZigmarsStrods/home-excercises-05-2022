package io.codelex.enums.practice.exercise2;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Roshambo {
    public static void main(String[] args) {
        boolean isGameOn = true;
        Scanner input = new Scanner(System.in);
        String scissors = SPT.S.getName();
        String paper = SPT.P.getName();
        String stone = SPT.T.getName();
        SPT usrSelect = null;
        int numTrials = 0;
        double usrWon = 0;
        double compWon = 0;
        System.out.println("Let us begin...");
        endOfGame:
        while (isGameOn) {
            System.out.println(scissors + "-" + paper + "-" + stone);
            while (true) {
                System.out.print("\tYour turn (Enter s for " + scissors + ", p for " + paper + ", t for " + stone + ", q to quit): ");
                String stringToCheckForQuit = input.nextLine().toUpperCase();
                if (stringToCheckForQuit.startsWith("Q")) {
                    break endOfGame;
                } else {
                    try {
                        usrSelect = SPT.valueOf(stringToCheckForQuit);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println("\tInvalid input, try again...");
                    }
                }
            }
            Random randGen = new Random();
            SPT compSelect = SPT.getSPTfromInt(randGen.nextInt(3));
            System.out.println("\tMy turn: " + compSelect.getName());
            numTrials++;
            boolean compWinCondition1 = compSelect == SPT.P && usrSelect == SPT.T;
            boolean compWinCondition2 = compSelect == SPT.S && usrSelect == SPT.P;
            boolean compWinCondition3 = compSelect == SPT.T && usrSelect == SPT.S;
            System.out.print("\t");
            if (compWinCondition1 || compWinCondition2 || compWinCondition3) {
                compWon++;
                System.out.println(compSelect.getName() + " beats " + usrSelect.getName() + ", I won!");
            } else if (compSelect == usrSelect) {
                System.out.println("Tie!");
            } else {
                usrWon++;
                System.out.println("You won!");
            }
            System.out.println();
        }
        System.out.println("\nNumber of trials: " + numTrials);
        if (numTrials != 0) {
            double usrWinPercentage = (usrWon / numTrials) * 100;
            double compWinPercentage = (compWon / numTrials) * 100;
            System.out.printf(Locale.ROOT, "I won %.0f(%.2f%%). You won %.0f(%.2f%%).\n", compWon, compWinPercentage, usrWon, usrWinPercentage);
        }
        System.out.println("Bye!");
    }
}
