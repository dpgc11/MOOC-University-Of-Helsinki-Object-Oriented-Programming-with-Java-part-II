/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private final double weight = 0.1;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double weight() {
        return this.weight; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
