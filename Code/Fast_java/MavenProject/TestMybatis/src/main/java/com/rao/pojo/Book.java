package com.rao.pojo;

public class Book {
    private int id;
    private String bookname;
    private String author;
    private double price;

    public Book() {
    }

    public Book(int id, String bookname, String author, double price) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
