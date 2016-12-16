/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Yogesh
 */
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        employees.add(person);
    }

    public void add(List<Person> persons) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            employees.add(iterator.next());
        }
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next().getEducation());
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        List<Person> toBeRemoved = new ArrayList<Person>();
        
        while(iterator.hasNext()) {
            if (iterator.next().getEducation() == education) 
                toBeRemoved.add(iterator.next());
        }
        
        employees.removeAll(toBeRemoved);
    }

}
