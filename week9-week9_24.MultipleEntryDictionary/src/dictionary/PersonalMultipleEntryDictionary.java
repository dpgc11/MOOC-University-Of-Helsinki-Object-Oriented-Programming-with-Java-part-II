/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Yogesh
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
    }
  
    @Override
    public void add(String word, String entry) {
         //To change body of generated methods, choose Tools | Templates.
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, new HashSet<String>());
        }
        this.dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
         //To change body of generated methods, choose Tools | Templates.
        if (!this.dictionary.containsKey(word)) {
            return null;
        }
        return this.dictionary.get(word);
    }

    @Override
    public void remove(String word) {
         //To change body of generated methods, choose Tools | Templates.
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
    }
    
}
