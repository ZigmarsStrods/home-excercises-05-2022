package io.codelex.oop.exercise03;

import java.util.Scanner;

public class Exercise3Test {
    public static void main(String[] args) {

        Manufacturer autovaz = new Manufacturer("AutoVAZ", 1966, "USSR");
        Manufacturer azlk = new Manufacturer("AZLK", 1930, "USSR");
        Manufacturer ford = new Manufacturer("Ford", 1903, "USA");
        Manufacturer mercis = new Manufacturer("Mercedes-Benz", 1926, "Germany");
        System.out.println(autovaz + "\t\t" + azlk);
        System.out.println(autovaz.hashCode() + " " + azlk.hashCode());

        Car ladaNiva = new Car("Niva", "VAZ-2123", 7, 1999, Engine.V12);
        ladaNiva.addManufacturer(autovaz);
        ladaNiva.addManufacturer(azlk);
        ladaNiva.addManufacturer(ford);
        Car ladaOka = new Car("Oka", "VAZ-1111", 3, 1988, Engine.S3);
        ladaOka.addManufacturer(autovaz);
        ladaOka.addManufacturer(azlk);
        ladaOka.addManufacturer(ford);
        Car mustang = new Car("Mustang", "Mark 1", 10, 1964, Engine.V12);
        //mustang.addManufacturer(autovaz);
        //mustang.addManufacturer(azlk);
        //mustang.addManufacturer(ford);
        mustang.addManufacturer(mercis);

        System.out.println(ladaNiva + "\t" + ladaOka);
        System.out.println(ladaNiva.hashCode() + " " + ladaOka.hashCode());

        CarService myCarServiceList = new CarService();
        myCarServiceList.addCar(ladaNiva);
        myCarServiceList.addCar(ladaOka);
        myCarServiceList.addCar(mustang);
        System.out.println("Service Car List: ");
        myCarServiceList.serviceCarList();
        System.out.println("V12 Car List: ");
        myCarServiceList.V12CarList();
        System.out.println("Cars before 1999: ");
        myCarServiceList.carsBefore1999();
        System.out.println("Most expensive car: ");
        System.out.println(myCarServiceList.getMostExpensive());
        System.out.println("Most affordable car: ");
        System.out.println(myCarServiceList.getCheapest());

        System.out.println("Cars with 3 manufacturers: ");
        myCarServiceList.getWith3Manufacturers();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sorting order (ASCENDING/DESCENDING): ");
        SortingOrder order = SortingOrder.valueOf(input.nextLine().toUpperCase());
        System.out.println("Car list sorted by name: ");
        myCarServiceList.getSortedByName(order);
        Car carToCheck = mustang;
        System.out.println("Check whether " + carToCheck.getName() + " is in the car list: ");
        myCarServiceList.checkCarInList(carToCheck);
        myCarServiceList.removeCar(carToCheck);
        System.out.println("Check whether Mustang is in the car list after removal: ");
        myCarServiceList.checkCarInList(carToCheck);
        Manufacturer manufacturerToCheck = azlk;
        System.out.println("Get all cars that are manufactured by " + manufacturerToCheck + ": ");
        myCarServiceList.getCarsFromManufacturer(manufacturerToCheck);
        System.out.println("Please enter the year for car manufacturer establishment:");
        int yearOfEstablishment = input.nextInt();
        input.nextLine();
        System.out.println("Please enter what period relative to the previously entered year should be taken (<,>, <=,> =, =,! =): ");
        String relation = input.nextLine();
        System.out.println("Car list for Your requested data is: ");
        myCarServiceList.getCarsWithManufacturerEstablishmentYear(yearOfEstablishment, relation);

    }
}
