package io.codelex.arrays.practice.exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    private static final List<String> words = List.of("abruptly", "foxglove", "lengths", "subway", "embezzle", "jukebox", "schnapps", "yoked");

    public static void main(String[] args) {
        String playOrQuit = "";
        do {
            StringBuilder misses = new StringBuilder();
            String guess = "";
            boolean isWordGuessed = false;
            int unsuccessTriesLeft = 7;
            Scanner input = new Scanner(System.in);
            Random gen = new Random();
            int selectedWordNum = gen.nextInt(words.size());
            String[] wordtoGuess = words.get(selectedWordNum).split("");
            String[] displayedWord = new String[wordtoGuess.length];
            Arrays.fill(displayedWord, "_");
            while (true) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                showStatus(displayedWord);
                System.out.println("Misses: " + misses);
                if (isWordGuessed) {
                    System.out.println("You guessed the word!");
                    break;
                } else if (unsuccessTriesLeft == 0) {
                    System.out.println("Unfortunately You run out of tries!");
                    break;
                }
                System.out.print("Guess: \t");
                guess = input.next();
                boolean isCharNotGuessed = true;
                isWordGuessed = true;
                for (int i = 0; i < wordtoGuess.length; i++) {
                    if (wordtoGuess[i].equals(guess)) {
                        displayedWord[i] = guess;
                        isCharNotGuessed = false;
                    }
                    if (displayedWord[i].equals("_")) {
                        isWordGuessed = false;
                    }
                }
                if (isCharNotGuessed && !misses.toString().contains(guess)) {
                    misses.append(guess);
                    unsuccessTriesLeft--;
                }
            }
            System.out.print("Play \"again\" or \"quit\"? ");
            playOrQuit = input.next();

        } while (playOrQuit.equals("again"));

    }

    private static void showStatus(String[] word) {
        System.out.print("Word: \t");
        for (String s : word) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
