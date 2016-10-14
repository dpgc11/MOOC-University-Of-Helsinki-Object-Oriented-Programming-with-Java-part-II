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

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    } 
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
            this.maxWeight-=suitcase.totalWeight();
        }
    }
   
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases " + "(" + totalWeight() + " kg)" ;   //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
    
    
}
