/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookbookingsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Library {
     private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
     
	    public static Library getInstance() {
	        if (instance == null) {
	            instance = new Library();
	        }
	        return instance;
	    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Get all books in the library
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

}
