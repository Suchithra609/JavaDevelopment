package com.skillcraft.EcommerceScraper;

import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Product> products =
                ProductScraper.scrapeProducts();

        System.out.println("Total products: " + products.size());

        for (Product p : products) {

            System.out.println(
                    p.name + " | "
                    + p.price + " | "
                    + p.rating
            );
        }

        CsvWriter.writeToCSV(products);
    }
}