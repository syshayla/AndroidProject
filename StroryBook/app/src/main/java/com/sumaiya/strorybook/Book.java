package com.sumaiya.strorybook;

public class Book {
    private String name;
    private String author;
    private int image;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getImage() {
        return image;
    }

    public Book() {
    }

    public Book(String name, String author, int image) {
        this.name = name;
        this.author = author;
        this.image = image;
    }
}
