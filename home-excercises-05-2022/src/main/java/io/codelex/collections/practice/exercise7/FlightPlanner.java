package io.codelex.collections.practice.exercise7;

import io.codelex.collections.practice.exercise8.Histogram;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    final static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());
        List<String> rawFlightData = Files.readAllLines(path, charset);
        Map<String, HashSet<String>> flightDataMap = new HashMap<>();
        for (String flight : rawFlightData) {
            String origin = flight.substring(0, flight.indexOf("->")).trim();
            String destination = flight.substring(flight.indexOf("->") + 2).trim();
            if (flightDataMap.containsKey(origin)) {
                flightDataMap.get(origin)
                        .add(destination);
            } else {
                flightDataMap.put(origin, Stream.of(destination)
                        .collect(Collectors.toCollection(HashSet::new)));
            }
        }

        while (true) {
            System.out.println("\nWhat would you like to do:");
            System.out.println("To display list of the cities press 1");
            System.out.println("To select a city from which you would like to start press 2");
            System.out.println("To exit program press #");

            String n = keyboard.nextLine();

            switch (n) {
                case "#" -> System.exit(0);
                case "1" -> displayCities(flightDataMap);
                case "2" -> citySelection(flightDataMap);
            }
        }
    }

    private static void citySelection(Map<String, HashSet<String>> flightMap) {
        System.out.println("\nPlease select the city You would like to start Your trip!");
        List<String> routeList = new ArrayList<>();
        Set<String> possibleCities = flightMap.keySet();
        while (true) {
            String selectedCity = keyboard.nextLine();
            if (possibleCities.contains(selectedCity)) {
                if (!routeList.isEmpty() && selectedCity.equals(routeList.get(0))) {
                    routeList.add(selectedCity);
                    break;
                }
                routeList.add(selectedCity);
                possibleCities = flightMap.get(selectedCity);
                System.out.println("\nFrom " + selectedCity + " You can go to cities below.");
                System.out.println("Please select the city You would like to go next:");
            } else {
                System.out.println("This city is not possible, please select the one from the list:");
            }
            possibleCities.forEach(System.out::println);

        }
        System.out.println("Your roundtrip route is:");
        routeList.forEach(System.out::println);

    }

    private static void displayCities(Map<String, HashSet<String>> flightMap) {
        System.out.println("\nYou can fly from following cities:");
        flightMap.keySet()
                .forEach(s -> System.out.println(s));
    }
}
