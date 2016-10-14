
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yogesh
 */
public class Tournament {

    private List<Skier> skiers;
    Scanner reader;
    private int count;
    Result result;

    public Tournament(Scanner reader) {
        this.skiers = new ArrayList<Skier>();
        this.reader = reader;
        this.count = 1;
    }

    public void start(Scanner reader){

        printWelcomeMsg();
        askNames();
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        furtherInstructions();

    }

    private void jump() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("");
        System.out.println("Round " + this.count);
        System.out.println("");
        System.out.println("Jumping order:");
        jumpOrder();
        printSkiers();
        showResults();

        this.count++;

    }

    public void jumpOrder() {
        SortAgainstPoints sorter = new SortAgainstPoints();
        Collections.sort(skiers, sorter);
    }

    public void printSkiers() {
        int i = 1;
        while (i <= this.skiers.size()) {
            for (Skier skier : this.skiers) {
                System.out.print(i + ". ");
                System.out.println(skier);
                i++;
            }
        }
        System.out.println("");
    }

    public void printFinalResults() {
        int i = 1;
        while (i <= this.skiers.size()) {
            for (Skier skier : this.skiers) {
                System.out.print(i + "           ");
                System.out.println(skier);
                System.out.print("            jump lengths: ");
                skier.printJumpLenghts();
                i++;
            }
        }
    }

    private void quit() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        printFinalResults();
    }

    public void askNames() {
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            this.skiers.add(new Skier(name));
        }
    }

    public void printWelcomeMsg() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    }

    public void furtherInstructions() {
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String cmd = reader.nextLine();
            if (cmd.equals("jump")) {
                jump();
            } else if (cmd.equals("quit")) {
                quit();
                break;
            }
        }
    }

    public void showResults() {
        System.out.println("");
        System.out.println("Results of round " + this.count);
        for (Skier skier : this.skiers) {
            System.out.println("  " + skier.getName());
            System.out.print("    length: ");
            System.out.println(skier.jumpLength());
            System.out.print("    judge votes: ");
            System.out.println(Arrays.toString(result.judgesScores()));
        }
        System.out.println("");
    }

}
