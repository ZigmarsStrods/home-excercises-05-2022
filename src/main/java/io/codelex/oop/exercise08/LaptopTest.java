package io.codelex.oop.exercise08;


public class LaptopTest {

    public static void main(String[] args) {


        Laptop firstLaptop = new Laptop("Pentium4", 128, "Radeon", "Lenovo", "SuperOne", "Alkaline");
        Laptop secondLaptop = new Laptop("AMD", 2048, "Nvidia", "HP", "Thinkpad", "Lithium-ion");

        firstLaptop.setProcessor("Intel Core i9-12900K");
        System.out.println(firstLaptop.getProcessor());

        secondLaptop.setRam(4096);
        System.out.println(secondLaptop.getRam());

        firstLaptop.setGraphicsCard("GeForce RTX® 30 Series");
        System.out.println(firstLaptop.getGraphicsCard());

        secondLaptop.setCompany("Acer");
        System.out.println(secondLaptop.getCompany());

        firstLaptop.setModel("MacBook Air (M2)");
        System.out.println(firstLaptop.getModel());

        secondLaptop.setBattery("Nickel metal hydride (NIMH)");
        System.out.println(secondLaptop.getBattery());

        System.out.println(secondLaptop.toString());

        System.out.println(secondLaptop.equals(firstLaptop));

        System.out.println(firstLaptop.hashCode());
    }
}
