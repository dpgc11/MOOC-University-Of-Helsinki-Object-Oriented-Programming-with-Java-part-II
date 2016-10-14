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

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
            this.maxWeight-=thing.getWeight();
        }
    }

    public String toString() {
        int weight = 0;
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }
        if (this.things.isEmpty()) {
            return  "empty " + "(" + weight + " kg)";
        } else if (this.things.size() == 1) {
            return this.things.size() + " thing " + "(" + weight + " kg)";
        }
        return this.things.size() + " things " + "(" + weight + " kg)";
    }
    
    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }
    
    public int totalWeight() { 
        int totalWeight = 0;
        for (Thing thing : this.things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing() {
        Thing heaviest = null;
        int weight = 0;
        for (Thing thing : this.things) {
            if (thing.getWeight() > weight ) {
                weight = thing.getWeight();
            }
        }
        for (Thing thing : this.things) {
            if (thing.getWeight() == weight) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
}
