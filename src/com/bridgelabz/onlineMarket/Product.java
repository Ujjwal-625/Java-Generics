package com.bridgelabz.onlineMarket;

public class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void displayProduct() {
        System.out.println(name + " | Price: $" + price + " | " + category);
    }
}

class MarketplaceUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount Applied: " + percentage + "% on " + product.getName());
    }
}


