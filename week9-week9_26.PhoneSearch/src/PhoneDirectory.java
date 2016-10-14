
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yogesh
 */
public class PhoneDirectory {

    private Map<String, List<String>> numbers;

    public PhoneDirectory() {
        this.numbers = new HashMap<String, List<String>>();
    }

    public void addNumber(Person person, String number) {
        if (this.numbers.containsKey(person.getName())) {
            this.numbers.get(person.getName()).add(number);
        } else {
            this.numbers.put(person.getName(), new ArrayList<String>());
        }
    }

    public String searchPerson(String number) {
        for (String name : this.numbers.keySet()) {
            if (this.numbers.get(name).contains(number)) {
                return name;
            }
        }
        return "not found";
    }

    public List<String> searchNumber(String name) {
       
        for (String str : this.numbers.keySet()) {
            if (str.equals(name)) {
                return this.numbers.get(str);
            } 
                
               
            
        }
        List<String> notFound = new ArrayList<String>();
        notFound.add("  not found");
        return notFound;
    }

}
