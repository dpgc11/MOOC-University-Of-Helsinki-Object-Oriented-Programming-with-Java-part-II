/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yogesh
 */
public class Group implements Movable{

    private List<Movable> group;

    public Group() {
        group = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        if (!group.contains(movable)) {
            group.add(movable);
        }
    }
  
    @Override
    public String toString() {
         //To change body of generated methods, choose Tools | Templates.
        String members = "";
        for (Movable m : group) {
            members += m + "\n";
        }
        return members;
    }
  
    @Override
    public void move(int dx, int dy) {
        //To change body of generated methods, choose Tools | Templates.
        for (Movable m : group) {
            m.move(dx, dy);
        }
    }
    
}
