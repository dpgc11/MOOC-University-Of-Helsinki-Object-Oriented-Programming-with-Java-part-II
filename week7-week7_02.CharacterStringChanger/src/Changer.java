/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
import java.util.ArrayList;

public class Changer {

    ArrayList<Change> changes;
    
    public Changer() {
        
        this.changes = new ArrayList<Change>();
        
    }

    public void addChange(Change change) {
        
        if (!this.changes.contains(change)) {
            this.changes.add(change);
        }
        
    }
    
    public String change(String characterString) {
        
        for (Change change : this.changes) {
            characterString += change.change(characterString);
        }
        
        return characterString;
    }
    
    
}
