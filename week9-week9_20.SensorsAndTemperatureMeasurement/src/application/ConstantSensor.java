/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Yogesh
 */
public class ConstantSensor implements Sensor{
    
    private int temp;

    public ConstantSensor(int temp) {
        this.temp = temp;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    
    @SuppressWarnings("empty-statement")
    public void off() {
        ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int measure() {
        return this.temp; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
