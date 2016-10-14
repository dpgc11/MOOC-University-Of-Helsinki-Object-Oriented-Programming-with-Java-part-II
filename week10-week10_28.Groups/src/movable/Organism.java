/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Yogesh
 */
public class Organism implements Movable{
    
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
         //To change body of generated methods, choose Tools | Templates.
        return "x: " + x + "; " + "y: " + y;
    }

    @Override
    public void move(int dx, int dy) {
         //To change body of generated methods, choose Tools | Templates.
        x += dx;
        y += dy;
    }
    
    
    
    
    
}
