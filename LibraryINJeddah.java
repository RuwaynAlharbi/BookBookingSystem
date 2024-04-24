/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookbookingsystem;

/**
 *
 * @author ruway
 */
public class LibraryINJeddah implements LibraryBranch{
    public LibraryINJeddah(){
        System.out.println("King Fahad Library");}
    
    public LibraryBranch makeCopy(){
        System.out.println("\nPrince Majed Road, Aljameah District");
        LibraryINJeddah WeekendOpject=null;
         try {
            WeekendOpject = (LibraryINJeddah) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } return WeekendOpject;}
    
  public String toString(){
      return "\nSunday:90 AM to 5:00 PM \nMonday: 9:00 AM to 5:00 PM\n" +
"Tuesday: 9:00 AM to 5:00 PM\n" +
"Wednesday: 9:00 AM to 5:00 PM\n" +
"Thursday: 9:00 AM to 8:00 PM\n" +
"Friday: Closed\n" +
"Saturday: 10:00 AM to 4:00 PM\n";
  }}

