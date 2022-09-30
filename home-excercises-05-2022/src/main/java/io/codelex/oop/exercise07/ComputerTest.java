package io.codelex.oop.exercise07;

public class ComputerTest {
    public static void main(String[] args) {

        Computer firstComp = new Computer("Pentium4", 128, "Radeon", "Lenovo", "SuperOne");
        Computer secondComp = new Computer("AMD", 2048, "Nvidia", "HP", "Thinkpad");

        firstComp.setProcessor("Intel Core i9-12900K");
        System.out.println(firstComp.getProcessor());

        secondComp.setRam(4096);
        System.out.println(secondComp.getRam());

        firstComp.setGraphicsCard("GeForce RTX® 30 Series");
        System.out.println(firstComp.getGraphicsCard());

        secondComp.setCompany("Acer");
        System.out.println(secondComp.getCompany());

        firstComp.setModel("MacBook Air (M2)");
        System.out.println(firstComp.getModel());

        System.out.println(secondComp.toString());

        System.out.println(secondComp.equals(firstComp));

        System.out.println(firstComp.hashCode());
    }
}
