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

public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> storage;
    private double weight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.storage = new ArrayList<ToBeStored>();
        this.weight = 0;
    }

    @Override
    public double weight() {
        return this.weight; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void add(ToBeStored store) {
        
        if (store.weight() + weight() <= this.maxWeight) {
            if (!this.storage.contains(store)) {
                this.storage.add(store);
                this.weight += store.weight();
            }
        }
        
    }
    
    
    
    
    
    
    
    
    
    
}
