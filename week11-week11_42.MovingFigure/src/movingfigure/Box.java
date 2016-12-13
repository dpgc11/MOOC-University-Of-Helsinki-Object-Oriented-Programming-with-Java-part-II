/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Yogesh
 */
public class Box extends Figure{

    private int width;
    private int height;
    
    public Box(int x, int y, int w, int h) {
        super(x, y);
        width = w;
        height = h;
    }
    
    @Override
    public void draw(Graphics graphics) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        graphics.fillRect(x, y, width, height);
    }
    
}
