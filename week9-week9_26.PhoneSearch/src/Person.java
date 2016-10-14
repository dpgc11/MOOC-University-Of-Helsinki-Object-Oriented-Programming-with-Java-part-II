
import java.util.ArrayList;
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
public class Person {
    
    private String name;
    private String number;
    private String address;
    private List<String> numbers;

    public Person() {
        this.numbers = new ArrayList<String>();
    }

    public Person(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
        this.numbers.add(number);
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void getNumbers() {
        for (String num : this.numbers) {
            System.out.println(num);
        }
    }
    
    
    
    
}
