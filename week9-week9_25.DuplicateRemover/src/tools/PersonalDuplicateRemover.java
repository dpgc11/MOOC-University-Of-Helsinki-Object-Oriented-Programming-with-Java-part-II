/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Yogesh
 */
public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set<String> words;
    private int numOfDuplicates;

    public PersonalDuplicateRemover() {
        this.words = new HashSet<String>();
        this.numOfDuplicates = 0;
    }
            
    @Override
    public void add(String characterString) {
         //To change body of geerated methods, choose Tools | Templates.
        if (!this.words.contains(characterString)) {
            this.words.add(characterString);
        } else {
            this.numOfDuplicates++;
        }
        
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
         //To change body of generated methods, choose Tools | Templates.
        return this.numOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
         //To change body of generated methods, choose Tools | Templates.
        return this.words;
    }

    @Override
    public void empty() {
         //To change body of generated methods, choose Tools | Templates.
        this.words.clear();
        this.numOfDuplicates = 0;
    }
    
}
