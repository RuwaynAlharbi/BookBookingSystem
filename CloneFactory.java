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
public class CloneFactory {
    public LibraryBranch getClone(LibraryBranch WeekDaySample){
       
        return WeekDaySample.makeCopy();
    }
    
}
