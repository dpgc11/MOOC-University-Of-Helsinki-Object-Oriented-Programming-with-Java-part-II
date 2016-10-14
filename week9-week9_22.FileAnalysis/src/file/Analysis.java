/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Yogesh
 */
public class Analysis {
    
    private File file;
    private Scanner reader;

    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException  {
        this.reader = new Scanner(this.file);
        int noOfLines = 0;
        String line;
        
        while(true) {
            if (reader.hasNextLine()) {
                line = reader.nextLine();
                noOfLines++;
            }
            else
                break;
        }
        reader.close();
        return noOfLines;
    }
    
    public int characters() throws FileNotFoundException {
        int noOfChars = 0;
        this.reader = new Scanner(this.file);
        String character;
        reader.useDelimiter("");
        while(true) {
            if (reader.hasNext()) {
                character = reader.next();
                noOfChars++;
                
            }
            else 
                break;
        }
        reader.close();
        return noOfChars;
    }
    
    
}
