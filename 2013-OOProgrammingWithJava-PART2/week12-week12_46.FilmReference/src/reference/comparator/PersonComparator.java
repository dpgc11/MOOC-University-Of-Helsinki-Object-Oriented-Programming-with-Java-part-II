/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Yogesh
 */
public class PersonComparator implements Comparator<Person>{
    
    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
        for (Person p : peopleIdentities.keySet()) {
            int id = peopleIdentities.get(p);
            p.setIdentity(id);
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getIdentity() - o1.getIdentity(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
