package com.company;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publishedYear;
    private String id;

    public Book(String isbn, String title, String author, int publishedYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
