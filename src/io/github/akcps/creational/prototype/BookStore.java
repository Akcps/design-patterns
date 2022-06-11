package io.github.akcps.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable {
    String name;
    List<Book> books;

    public BookStore() {
        addBooks();
    }

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }


    public void addBooks() {
        // call to DB, expensive and time-consuming.
        Book book1 = new Book(1, "Data Structures and Algorithms");
        Book book2 = new Book(2, "System Design");
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //  super.clone(); shallow copy
        // deep copy

        List<Book> copies = new ArrayList<>();
        for (Book b: books) {
            copies.add(new Book(b.id, b.name));
        }
        return new BookStore(copies);
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
