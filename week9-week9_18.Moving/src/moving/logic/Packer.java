/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Yogesh
 */
public class Packer {
    private int boxesVolume;
    private List<Box> boxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        
    }
    
    public List<Box> packThings(List<Thing> things) {
        this.boxes = new ArrayList<Box>();
        boxes.add(new Box(this.boxesVolume));
        for (Thing thing: things) {
            if (!boxes.get(boxes.size()-1).addThing(thing)) {
                boxes.add(new Box(this.boxesVolume));
                boxes.get(boxes.size()-1).addThing(thing);
            }
        }
        
        return this.boxes;
    }
}
