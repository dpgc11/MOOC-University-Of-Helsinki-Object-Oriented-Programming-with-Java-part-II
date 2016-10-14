
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
public class Printer {
    private File file;
    private Scanner reader;
    

    public Printer(String fileName) throws Exception{
        
        this.file = new File(fileName);
        
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException {
        this.reader = new Scanner(this.file);
        while(reader.hasNextLine()) {
            String fileLine = reader.nextLine();
            if (fileLine.contains(word)) {
                System.out.println(fileLine);
            }
        }
        reader.close();
      
    }
    
    
}
