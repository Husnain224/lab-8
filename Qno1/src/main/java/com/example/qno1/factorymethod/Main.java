package com.example.qno1.factorymethod;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product type (Electronics, Clothing, Books): ");
        String productType = scanner.nextLine();

        try {
            Product product = ProductFactory.createProduct(productType);
            product.displayInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

