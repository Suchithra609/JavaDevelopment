package com.skillcraft.EcommerceScraper;

import java.io.FileWriter;
import java.util.List;

import com.opencsv.CSVWriter;

public class CsvWriter {

    public static void writeToCSV(List<Product> products) {

        try {

            CSVWriter writer =
                    new CSVWriter(new FileWriter("products.csv"));

            writer.writeNext(new String[] {
                    "Product Name",
                    "Price",
                    "Rating"
            });

            for (Product p : products) {

                writer.writeNext(new String[] {
                        p.name,
                        p.price,
                        p.rating
                });
            }

            writer.close();

            System.out.println("CSV file created successfully!");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}