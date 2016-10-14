
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
public class SortAgainstPoints implements Comparator<Skier>{

    @Override
    public int compare(Skier o1, Skier o2) {
         //To change body of generated methods, choose Tools | Templates.
        return o1.getPoints() - o2.getPoints();
    }
    
}
