package com.zjrcu.first_springboot.Conditional_Test;

public class Book {
    private String bookName;
    private String bookType;
    private double price;
    public Book(String bookName, String bookType, double price) {
        this.bookName = bookName;
        this.bookType = bookType;
        this.price = price;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookType() {
        return bookType;
    }
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookType='" + bookType + '\'' +
                ", price=" + price +
                '}';
    }
}
