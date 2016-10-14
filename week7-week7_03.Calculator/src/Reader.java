/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
import java.util.Scanner;

public class Reader {
    private Scanner reader;
    
    public Reader() {
        this.reader = new Scanner(System.in);
    }
    
    public String readString() {
        String read = reader.nextLine();
        return read;
    }
    
    public int readInteger() {
        int read = Integer.parseInt(reader.nextLine());
        return read;
    }
}
