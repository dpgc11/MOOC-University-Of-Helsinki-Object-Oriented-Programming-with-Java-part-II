
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yogesh
 */
public class Skier {

    private String name;
    private int points;
    private List<Integer> jumpLengths;
    private Random rand;

    public Skier(String name) {
        this.name = name;
        this.points = 0;
        this.jumpLengths = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        //To change body of generated methods, choose Tools | Templates.
        return this.name + " (" + this.points + " points)";
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int jumpLength() {
        int jumpLength = generateJumpLength();
        this.jumpLengths.add(jumpLength);
        return jumpLength;
    }

    public int generateJumpLength() {
        rand = new Random();
        int low = 60;
        int high = 121;
        return rand.nextInt((high - low)) + low;
    }

    public void printJumpLenghts() {
        int i = 0;
        while (i <= this.jumpLengths.size() - 1) {
            System.out.print(this.jumpLengths.get(i));
            System.out.print(" m, ");
            i++;
        }
        System.out.print(this.jumpLengths.get(this.jumpLengths.size()));
        System.out.println(" m");
    }
}
