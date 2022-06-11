package io.github.akcps.creational.prototype;

public class BookStoreDriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookStore bookStore1 = new BookStore();
        bookStore1.setName("Book Store 1");

        BookStore bookStore2 = (BookStore) bookStore1.clone();
        bookStore2.setName("Book Store 2");

        System.out.println(bookStore1);
        System.out.println(bookStore2);
    }
}
