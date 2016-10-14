/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Yogesh
 */
public class Thermometer implements Sensor {

    private int temp;
    private final Random rand;
    private boolean status;

    public Thermometer() {
        this.status = false;
        this.rand = new Random();

    }

    @Override
    public boolean isOn() {
        return this.status; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void on() {
        this.status = true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void off() {
        this.status = false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int measure() {
        //To change body of generated methods, choose Tools | Templates.
        if (isOn()) {
            this.temp = (rand.nextInt(30 -(-30) + 1) - 30);
            return this.temp;
        } else {
            throw new IllegalStateException();
        }
        
    }

}
