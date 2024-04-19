/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookbookingsystem;

/**
 *
 * @author USER
 */
public class Booking {
    private final Customer customer;
    private Book book;

    public Booking(Customer customer, Book book) {
        this.customer = customer;
        this.book = book;
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public Book getBook() {
        return book;
    }

}
