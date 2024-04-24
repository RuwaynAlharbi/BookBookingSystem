/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookbookingsystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruway
 */
public class LibraryINRiyadh implements LibraryBranch {
    public LibraryINRiyadh(){
        System.out.println("King Fahad Library");}
    
    public LibraryBranch makeCopy(){
        System.out.println("\nPrince Majed Road, Alolia District");
        LibraryINRiyadh NormalOpject=null;
         try {
            NormalOpject = (LibraryINRiyadh) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } return NormalOpject;}
    
  public String toString(){
      return "\nSunday:90 AM to 5:00 PM \nMonday: 9:00 AM to 5:00 PM\n" +
"Tuesday: 9:00 AM to 5:00 PM\n" +
"Wednesday: 9:00 AM to 5:00 PM\n" +
"Thursday: 9:00 AM to 8:00 PM\n" +
"Friday: Closed\n" +
"Saturday: 10:00 AM to 4:00 PM\n";
  }}
        
    
            

