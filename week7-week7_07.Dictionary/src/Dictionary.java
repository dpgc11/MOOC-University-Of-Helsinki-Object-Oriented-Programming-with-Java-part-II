/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
import java.util.HashMap;
import java.util.ArrayList;
        

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        return null;
    }

    public void add(String word, String translation) {
        if (dictionary.containsKey(word)) {
            System.out.println("Dictionary already contains " + word);
        } else {
            dictionary.put(word, translation);
        }
    }
    
    public int amountOfWords() {
        int numOfWords = 0;
        for (String key : this.dictionary.keySet()) {
            numOfWords++;
        }
        return numOfWords;
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<String>(this.dictionary.values());
        ArrayList<String> words = new ArrayList<String>(this.dictionary.keySet());
        ArrayList<String> translationList = new ArrayList<String>();
        String entry = "";
        for (int i = 0; i < words.size(); i++) {
            entry = translations.get(i) + " = " + words.get(i);
            translationList.add(entry);  
        }
        return translationList;
        
    }
}
