package io.codelex.oop.exercise08;

import io.codelex.oop.exercise07.Computer;

import java.util.Objects;

public class Laptop extends Computer {

    private String battery;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + getProcessor() + '\'' +
                ", ram=" + getRam() +
                ", graphicsCard='" + getGraphicsCard() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", model='" + getModel() + '\'' +
                ", battery='" + battery + '\'' +
                '}';


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
