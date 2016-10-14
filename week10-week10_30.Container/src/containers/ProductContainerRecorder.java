/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Yogesh
 */
public class ProductContainerRecorder extends ProductContainer{

    private ContainerHistory containerHistory;
    

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.containerHistory = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }
    
    public String history() {
        return containerHistory.toString();
    }
    
    
    
    
    
}
