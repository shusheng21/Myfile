package com.rao.book_coolection;

public class Book {
    private String bName;
    private String bAuthor;
    private double price;

    public Book() {
    }

    public Book(String bName, String bAuthor, double price) {
        this.bName = bName;
        this.bAuthor = bAuthor;
        this.price = price;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
