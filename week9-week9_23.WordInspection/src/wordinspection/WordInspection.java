/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yogesh
 */
public class WordInspection {

    private File file;
    private Scanner reader;
    private List<String> wordsInFile;

    public WordInspection(File file) throws FileNotFoundException {
        this.file = file;
        readWords();
    }
    
    public void printWords() {
        int count = 1;
        for (String word : this.wordsInFile) {
            System.out.println(count + word);
            count++;
        }
    }

    public void readWords() throws FileNotFoundException {
        this.wordsInFile = new ArrayList<String>();
        String word;
        this.reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNext()) {
            word = reader.next();
            wordsInFile.add(word);
        }
    }

    public int wordCount() throws FileNotFoundException {

        return this.wordsInFile.size();
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> wordsContainingZ = new ArrayList<String>();

        for (String word : this.wordsInFile) {
            if (word.contains("z") || word.contains("Z")) {
                wordsContainingZ.add(word);
            }
        }

        return wordsContainingZ;
    }
    
    public List<String> wordsEndingInL() {
        List<String> wordsEndingInL = new ArrayList<String>();
        
        for (String word : this.wordsInFile) {
            if (word.endsWith("l")) {
                 wordsEndingInL.add(word);
            }
        }
        return wordsEndingInL;
    }
    
    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        String rev = "";
        for (String word : this.wordsInFile) {
            rev = revWord(word);
            if (word.equalsIgnoreCase(rev)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }
    
    public static String revWord(String word) {
        String original = word;
        String rev = "";
        
        for (int i = original.length()-1; i >= 0; i--) {
            rev += original.charAt(i);
        }
        
        return rev;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        List<String> wordsWhichContainAllVowels = new ArrayList<String>();
        
        for (String word : this.wordsInFile) {
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")) {
                wordsWhichContainAllVowels.add(word);
            }
        }
        return wordsWhichContainAllVowels;
    }

}
