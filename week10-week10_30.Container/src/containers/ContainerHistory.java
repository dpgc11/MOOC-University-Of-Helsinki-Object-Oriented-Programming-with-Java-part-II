/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;

/**
 *
 * @author Yogesh
 */
public class ContainerHistory {

    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public double maxValue() {

        if (this.history.isEmpty()) {
            return 0.0;
        }

        double max = this.history.get(0);
        for (Double d : this.history) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double minValue() {

        if (this.history.isEmpty()) {
            return 0.0;
        }

        double min = this.history.get(0);
        for (Double d : this.history) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double average() {
        double avg = 0.0;
        double sum = 0;

        for (Double d : history) {
            sum += d;
        }

        avg = (sum / history.size());
        return avg;
    }

    public double greatestFluctuation() {
        if (history.isEmpty() || history.size() == 1) {
            return 0.0;
        }

        double max = Math.abs(history.get(0) - history.get(1));
        double difference;

        for (int i = 1; i < history.size() - 1; i++) {
            difference = Math.abs(history.get(i) - history.get(i + 1));
            if (difference > max) {
                max = difference;
            }
        }
        difference = Math.abs(history.get(history.size() - 2) - history.get(history.size() - 1));
        if (difference > max) {
            max = difference;
        }

        return max;
    }

    public double variance() {
        double avg = average();
        double sum = 0.0;
        double num;
        for (Double d : history) {
            num = (d - avg);
            sum += Math.pow(num, 2);
        }
        double variance = (sum / (history.size() - 1));
        return variance;
    }

}
