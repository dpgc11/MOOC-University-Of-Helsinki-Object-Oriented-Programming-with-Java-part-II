/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yogesh
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> totalReadings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.totalReadings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        boolean on = true;
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                on = false;
            }
        }
        return on;
    }

    public void on() {
        for (Sensor s : this.sensors){
            s.on();
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void off() {
         //To change body of generated methods, choose Tools | Templates.
        for (Sensor s : this.sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
         //To change body of generated methods, choose Tools | Templates.
        if (isOn()) {
        int sum = 0;
        int count = 0;
        for (Sensor s : this.sensors) {
            sum += s.measure();
            count++;
        }
        int result = sum / count;
        this.totalReadings.add(result);
        return result;
    } else {
            throw new IllegalStateException();
        }
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return this.totalReadings;
    }

}
