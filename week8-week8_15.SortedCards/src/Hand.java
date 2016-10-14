
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int sum() {
        int value = 0;
        for (Card card : this.hand) {
            value += card.getValue();
        }
        
        return value;
    }

    @Override
    public int compareTo(Hand o) {
         //To change body of generated methods, choose Tools | Templates.
        return this.sum() - o.sum();
    }
    
    public void sortAgainstSuit() {
        
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(hand, suitSorter);
        
    }
    
    
    
}
