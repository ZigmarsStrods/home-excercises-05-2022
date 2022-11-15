package io.codelex.oop.exercise03;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private BigDecimal price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturerList;
    private Engine engineType;

    public Car(String name, String model, double price, int yearOfManufacture, Engine engineType) {
        this.name = name;
        this.model = model;
        this.price = new BigDecimal(price);
        this.yearOfManufacture = yearOfManufacture;
        manufacturerList = new LinkedList<>();
        this.engineType = engineType;
    }

    public void addManufacturer(Manufacturer manufacturerToAdd) {
        manufacturerList.add(manufacturerToAdd);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                Objects.equals(price, car.price) &&
                Objects.equals(manufacturerList, car.manufacturerList) &&
                engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturerList, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturerList=" + manufacturerList +
                ", engineType=" + engineType +
                "}";
    }

    public Engine getEngineType() {
        return engineType;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public String getName() {
        return name;
    }
}
