package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // toString override
    @Override
    public String toString() {
        return name + ": $" + price;
    }

    // Main method for testing
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Mouse", 25.50));

        // Print each product
        products.forEach(System.out::println);
    }
}
