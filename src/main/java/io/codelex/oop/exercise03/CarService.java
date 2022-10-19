package io.codelex.oop.exercise03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class CarService {

    private List<Car> carlist;

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
        carlist.forEach(car -> System.out.println(car));
    }

    public void V12CarList() {
        List<Car> V12list = carlist.stream()
                .filter(car -> car.getEngineType() == Engine.V12)
                .toList();
        printoutCarList(V12list);
    }

    public void carsBefore1999() {
        List<Car> prior1999cars = carlist.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .toList();
        printoutCarList(prior1999cars);
    }

    public String getMostExpensive() {
        return Collections.max(carlist, (Car a, Car b) -> a.getPrice().compareTo(b.getPrice())).toString();

    }

    public String getCheapest() {
        return Collections.min(carlist, (Car a, Car b) -> a.getPrice().compareTo(b.getPrice())).toString();
    }

    public void getWith3Manufacturers() {
        List<Car> threeManufacturers = carlist.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .toList();
        printoutCarList(threeManufacturers);
    }

    public void getSortedByName(SortingOrder order) {
        if (order == SortingOrder.ASCENDING) {
            Collections.sort(carlist, (Car a, Car b) -> a.getName().compareTo(b.getName()));
        } else if (order == SortingOrder.DESCENDING) {
            Collections.sort(carlist, (Car a, Car b) -> b.getName().compareTo(a.getName()));
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
        subCarList.forEach(car -> System.out.println(car));
    }
}
