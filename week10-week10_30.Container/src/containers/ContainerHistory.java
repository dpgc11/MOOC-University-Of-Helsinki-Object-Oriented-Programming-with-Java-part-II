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
public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    @Override
    public String toString() {
        //To change body of generated methods, choose Tools | Templates.
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0.0;
        }

        double maxValue = history.get(0);
        for (Double d : history) {
            if (d > maxValue) {
                maxValue = d;
            }
        }

        return maxValue;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        }

        double minValue = history.get(0);
        for (Double d : history) {
            if (d < minValue) {
                minValue = d;
            }
        }

        return minValue;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        }

        double average;
        double total = 0.0;

        for (Double d : history) {
            total += d;
        }

        average = (total / history.size());
        return average;

    }

    public double greatestFluctuation() {
        if (history.isEmpty() || history.size() == 1) {
            return 0.0;
        }
        double greatestFluc = 0, fluc = 0, lastVal = history.get(0);
        for (double d : history) {
            fluc = Math.abs(lastVal - d);
            if (fluc > greatestFluc) {
                greatestFluc = fluc;
            }
            lastVal = d;
        }
        
        return greatestFluc;
    }

    public double variance() {
        if (history.isEmpty() || history.size() == 1) {
            return 0.0;
        }
        double variance = 0;
        
        for(double d : history) {
            variance += Math.pow(d-this.average(), 2);
        }
        return variance/(history.size()-1);
    }

}
