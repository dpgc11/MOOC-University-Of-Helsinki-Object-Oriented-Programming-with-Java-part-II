/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yogesh
 */
public class Box implements Thing {

    private List<Thing> things;
    private int maximumCapacity;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        boolean isAdded = false;
        if (thing.getVolume() + this.getVolume() <= this.maximumCapacity) {
            this.things.add(thing);
            isAdded = true;
        }
        return isAdded;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : this.things) {
            volume += thing.getVolume();//To change body of generated methods, choose Tools | Templates.
        }
        return volume;

    }

    @Override
    public String toString() {
        return "  things in the box: " + this.getVolume()+ " dm^3"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
