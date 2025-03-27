package com.bridgelabz.onlineMarket;

import java.util.ArrayList;
import java.util.List;

public class OnlineMarket {
    public static void main(String[] args) {
        // Creating products
        Product<BookCategory> book = new Product<>("The Alchemist", 15.99, new BookCategory("Fiction"));
        Product<ClothingCategory> tshirt = new Product<>("T-Shirt", 19.99, new ClothingCategory("Casual Wear"));
        Product<GadgetCategory> phone = new Product<>("Smartphone", 499.99, new GadgetCategory("TechBrand"));

        // Adding products to catalog
        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(tshirt);
        catalog.add(phone);

        // Display catalog
        System.out.println("Product Catalog:");
        for (Product<?> product : catalog) {
            product.displayProduct();
        }

        // Apply discount
        System.out.println("\nApplying Discounts:");
        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(tshirt, 15);
        MarketplaceUtils.applyDiscount(phone, 5);

        // Display catalog after discount
        System.out.println("\nUpdated Product Catalog:");
        for (Product<?> product : catalog) {
            product.displayProduct();
        }
    }
}
