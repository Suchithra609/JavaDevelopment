package com.skillcraft.EcommerceScraper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProductScraper {

    public static List<Product> scrapeProducts() {

        List<Product> products = new ArrayList<Product>();

        try {

            String url = "https://books.toscrape.com/";

            Document document = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0")
                    .get();

            Elements books = document.select("article.product_pod");

            for (Element book : books) {

                String name = book.select("h3 a").attr("title");

                String price = book.select(".price_color").text();

                String rating = book.select("p.star-rating")
                        .attr("class")
                        .replace("star-rating", "")
                        .trim();

                Product product = new Product(name, price, rating);

                products.add(product);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return products;
    }
}