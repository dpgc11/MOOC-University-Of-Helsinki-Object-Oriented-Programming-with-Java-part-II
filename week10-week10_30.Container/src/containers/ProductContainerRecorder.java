/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yogesh
 */
public class ProductContainerRecorder extends ProductContainer{

    private ContainerHistory containerHistory;
    
    public ProductContainerRecorder(String name, double capacity, double initialVolume) {
        super(name,capacity);
        this.containerHistory = new ContainerHistory();
        this.addToTheContainer(initialVolume);
       
    }
    
    public String history() {
        return containerHistory.toString();
    }
    
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.containerHistory.add(this.getVolume());
    }
    
    public double takeFromTheContainer(double amount) {
        double vol1 = this.getVolume();
        super.takeFromTheContainer(amount);
        this.containerHistory.add(this.getVolume());
        return vol1 - this.getVolume();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: " + containerHistory.variance());
    }
    
}
