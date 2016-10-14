/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.logic.Packer;



/**
 *
 * @author Yogesh
 */
public class Main {
    
    public static void main(String[] args) {
        
        // the things we want to pack
    List<Thing> things = new ArrayList<Thing>();
    things.add(new Item("passport", 2));
    things.add(new Item("toothbrash", 1));
    things.add(new Item("book", 4));
    things.add(new Item("circular saw", 8));

    // we create a packer which uses boxes whose valume is 10
    Packer packer = new Packer(10);

    // we ask our packer to pack things into boxes
    List<Box> boxes = packer.packThings( things );

    System.out.println("number of boxes: "+boxes.size());

    for (Box box : boxes) {
        System.out.println(box);
    }
        
        
    }
}
