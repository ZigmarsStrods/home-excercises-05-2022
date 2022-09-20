package io.codelex.classesandobjects.practice.exercise11;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            String n = keyboard.nextLine();

            switch (n) {
                case "0":
                    System.exit(0);
                case "1":
                    fillVideoStore(keyboard);
                    break;
                case "2":
                    rentVideo(keyboard);
                    break;
                case "3":
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name: ");
            String movieName = scanner.nextLine();
            VideoStore.addToInventory(movieName);
            System.out.println("Enter rating 1");
            double rating = Double.parseDouble(scanner.nextLine());
            VideoStore.enterRating(movieName, rating);
            System.out.println("Enter rating 2");
            rating = Double.parseDouble(scanner.nextLine());
            VideoStore.enterRating(movieName, rating);
            System.out.println("Enter rating 3");
            rating = Double.parseDouble(scanner.nextLine());
            VideoStore.enterRating(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        VideoStore.checkoutVideo("The Matrix");
        VideoStore.checkoutVideo("Godfather II");
        VideoStore.listInventory();
        VideoStore.checkoutVideo("Star Wars Episode IV: A New Hope");

    }

    private static void returnVideo(Scanner scanner) {
        VideoStore.returnVideo("The Matrix");
        VideoStore.returnVideo("Godfather II");
        VideoStore.listInventory();
        VideoStore.returnVideo("Star Wars Episode IV: A New Hope");

    }
}
