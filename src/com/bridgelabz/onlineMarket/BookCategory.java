package com.bridgelabz.onlineMarket;

public class BookCategory {
    private String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book Genre: " + genre;
    }
}
