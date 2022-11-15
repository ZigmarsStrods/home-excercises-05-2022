package io.codelex.oop.exercise03;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class CarService {

    private final List<Car> carlist;

    public CarService() {
        carlist = new LinkedList<>();
    }

    public CarService(List<Car> carlist) {
        this.carlist = carlist;
    }

    public void addCar(Car carToAdd) {
        carlist.add(carToAdd);
    }

    public void removeCar(Car carToRemove) {
        carlist.remove(carToRemove);
    }

    public void serviceCarList() {
        carlist.forEach(System.out::println);
    }

    public void getCarsByEngineType(Engine engineType) {
        List<Car> carListByEngineType = carlist.stream()
                .filter(car -> car.getEngineType() == engineType)
                .toList();
        printoutCarList(carListByEngineType);
    }

    public void getCarsBeforeGivenYear(int year) {
        List<Car> carListBeforeYear = carlist.stream()
                .filter(car -> car.getYearOfManufacture() < year)
                .toList();
        printoutCarList(carListBeforeYear);
    }

    public String getMostExpensive() {
        return Collections.max(carlist, Comparator.comparing(Car::getPrice)).toString();

    }

    public String getCheapest() {
        return Collections.min(carlist, Comparator.comparing(Car::getPrice)).toString();
    }

    public void getWith3Manufacturers() {
        List<Car> threeManufacturers = carlist.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .toList();
        printoutCarList(threeManufacturers);
    }

    public void getSortedByName(SortingOrder order) {
        if (order == SortingOrder.ASCENDING) {
            carlist.sort(Comparator.comparing(Car::getName));
        } else if (order == SortingOrder.DESCENDING) {
            carlist.sort((Car a, Car b) -> b.getName().compareTo(a.getName()));
        }
        serviceCarList();
    }

    public void checkCarInList(Car carToCheck) {
        if (carlist.contains(carToCheck)) {
            System.out.println(carToCheck.getName() + " is in the service list");
        } else {
            System.out.println(carToCheck.getName() + " is not in the service list");
        }
    }

    public void getCarsFromManufacturer(Manufacturer manufacturerInterested) {
        List<Car> listManufacturerInterested = carlist.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturerInterested))
                .toList();
        printoutCarList(listManufacturerInterested);

    }

    public void getCarsWithManufacturerEstablishmentYear(int year, String relation) {
        List<Car> carListRequested = new LinkedList<>();
        for (Car car : carlist) {
            brk:
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                switch (relation) {
                    case "<" -> {
                        if (manufacturer.getYearOfEstablishment() < year) {
                            carListRequested.add(car);
                            break brk;
                        }
                    }
                    case ">" -> {
                        if (manufacturer.getYearOfEstablishment() > year) {
                            carListRequested.add(car);
                            break brk;
                        }
                    }
                    case "<=" -> {
                        if (manufacturer.getYearOfEstablishment() <= year) {
                            carListRequested.add(car);
                            break brk;
                        }
                    }
                    case ">=" -> {
                        if (manufacturer.getYearOfEstablishment() >= year) {
                            carListRequested.add(car);
                            break brk;
                        }
                    }
                    case "=" -> {
                        if (manufacturer.getYearOfEstablishment() == year) {
                            carListRequested.add(car);
                            break brk;
                        }
                    }
                    case "!=" -> {
                        if (manufacturer.getYearOfEstablishment() != year) {
                            carListRequested.add(car);
                            break brk;
                        }
                    }
                }
            }

        }
        if (carListRequested.size() == 0) {
            System.out.println("No cars found for the requested data!!!");
        } else {
            printoutCarList(carListRequested);
        }
    }

    private static void printoutCarList(List<Car> subCarList) {
        subCarList.forEach(System.out::println);
    }
}
