/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Yogesh
 */
public class Student extends Person{
    
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
}

    @Override
    public String toString() {
        return super.toString() + "\n  credits " + credits; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void study() {
        credits++;
    }
    
    public int credits() {
        return credits;
    }
    
}
