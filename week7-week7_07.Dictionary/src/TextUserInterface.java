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

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        System.out.println("Statement:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");
        System.out.println("");
        String userInput = null;
        while (true) {
            System.out.print("Statement: ");
            
            userInput = reader.nextLine();
            if (userInput.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (userInput.equals("add")){
                add();
            } else if (userInput.equals("translate")) {
                translate();
            }
            else {
                System.out.println("Unknown statement");
                System.out.println("");
            }
        }
    }
    
    public void add() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        this.dictionary.add(word, translation);
        System.out.println("");
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.dictionary.translate(word);
        System.out.print(translation);
        System.out.println("");
    }
    
    
}

