package io.codelex.classesandobjects.practice.product;

import java.util.Locale;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {

        Product logtechMouse = new Product("Logitech mouse", 70, 14);
        Product iPhone5s = new Product("iPhone 5s", 999.99, 3);
        Product epsonEBU05 = new Product("Epson EB-U05", 440.46, 1);

        logtechMouse.printProduct();
        System.out.println("Please enter the new product quantity: ");
        Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);
        int newQuantity = input.nextInt();
        logtechMouse.setAmount(newQuantity);
        logtechMouse.printProduct();
        System.out.println();

        iPhone5s.printProduct();
        System.out.println("Please enter the new price of the product: ");
        double newPrice = input.nextDouble();
        iPhone5s.setPrice(newPrice);
        iPhone5s.printProduct();
        System.out.println();

        epsonEBU05.printProduct();


    }
}
