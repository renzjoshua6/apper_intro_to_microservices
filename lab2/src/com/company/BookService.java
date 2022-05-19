package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService {

    public static BookService bookServiceInstance = new BookService();
    private final Map<String, Book> books = new HashMap<>();
    public final IdGenerator idGen = new IdGenerator();
    BookService(){

    }

    public static BookService getInstance() {
        if (bookServiceInstance != null) {
            bookServiceInstance = new BookService();
        }
        return bookServiceInstance;
    }

    public Book registerBook(String isbn, String title, String author, int publishedYear) throws InvalidFormat, YoungBookError {
           if (isbn.isEmpty() || title.isEmpty() || author.isEmpty() || String.valueOf(publishedYear).isEmpty()) {
               throw new InvalidFormat();
           }
           int present_year = LocalDate.now().getYear();
           int bookAge = present_year - publishedYear;
           if (bookAge <= 3) {
               throw new YoungBookError();
           }
           Book newBook = new Book(isbn,title, author, publishedYear);
           newBook.setId(IdGenerator.getNext());
           books.put(isbn, newBook);

           return newBook;
       }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBook(String isbn) throws Exception {
        if (books.containsKey(isbn)) {
            return books.get(isbn);
        }

        throw new Exception("Book not found!");
    }

    public void updateBook(String isbn, Book updatedBook) throws Exception {
        if (!books.containsKey(isbn)) {
            throw new Exception("Book to update not found!");
        }

        books.put(isbn, updatedBook);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public long countPublishedBooks(int publishedYear) {
        return books.values().stream()
                .filter(book -> book.getPublishedYear() == publishedYear)
                .count();
    }
}
