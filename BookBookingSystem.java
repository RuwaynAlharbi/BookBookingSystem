/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookbookingsystem;

import java.util.List;

/**
 *
 * @author USER
 */
public class BookBookingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book book3 = new Book("1984", "George Orwell", 328);

        // Create some customers
        Customer customer1 = new Customer("John Doe", "john@example.com");
        Customer customer2 = new Customer("Jane Smith", "jane@example.com");

        // Create a library and add books to it
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books in the library
        List<Book> allBooks = library.getAllBooks();
        System.out.println("Books available in the library:");
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Make a booking for a book
        Booking booking1 = new Booking(customer1, book1);
        System.out.println("Booking made: " + booking1.getCustomer().getName() + " has booked " + booking1.getBook().getTitle());
          
        int num;
        CloneFactory WorkDay= new CloneFactory();   
        Scanner scanner = new Scanner(System.in);
        System.out.println("King Fahad Library");
        System.out.println("1-In Jeddah\n2-In Riyadh");
        num= scanner.nextInt();

        switch(num){
            case 1:
                
               LibraryINJeddah Jeddah= new LibraryINJeddah();
                LibraryINJeddah ClonedWeekend=(LibraryINJeddah) WorkDay.getClone(Jeddah);
                System.out.println(Jeddah);
               
               
                
            
                break;
                
            case 2:
                
                
                LibraryINRiyadh Riyadh= new LibraryINRiyadh();
                LibraryINRiyadh ClonedRiyadh=(LibraryINRiyadh) WorkDay.getClone(Riyadh);
                System.out.println(Riyadh);
               
                
                break;
                
            default:
                System.out.println("Sorry you entered the wrong number");
                break;
        }

        // Close the scanner
        scanner.close();
    
    }

    }
    
