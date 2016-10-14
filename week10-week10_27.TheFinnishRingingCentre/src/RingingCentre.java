
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
public class RingingCentre {
    
    private Map<Bird, List<String>> observed;

    public RingingCentre() {
        this.observed = new HashMap<Bird, List<String>>();
    }
    
    
    
    public void observe(Bird bird, String place) {
        if (!observed.containsKey(bird)) {
            observed.put(bird, new ArrayList<String>());
        }
        observed.get(bird).add(place);
    }
    
    public void observations(Bird bird) {
        System.out.print(bird);
        System.out.print(" observations: ");
        if (observed.get(bird) == null) {
            System.out.println("0");
        } else {
            System.out.println(observed.get(bird).size());
            for (String s : observed.get(bird)) {
                System.out.println(s);
            }
        }
    }
    
}
