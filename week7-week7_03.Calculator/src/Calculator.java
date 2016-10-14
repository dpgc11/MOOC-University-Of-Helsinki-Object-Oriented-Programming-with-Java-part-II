/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
public class Calculator {

    private Reader reader;

    private int count;

    public Calculator() {
        this.reader = new Reader();

        count = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();

            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int sum = value1 + value2;
        System.out.println("sum of the values " + sum);
        count++;
    }

    private void difference() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int difference = value1 - value2;
        System.out.println("difference of the values " + difference);
        count++;
    }

    private void product() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int product = value1 * value2;
        System.out.println("product of the values " + product);
        count++;
    }

    private void statistics() {
        System.out.println("Calculations done " + count);
    }
}
