
import java.util.ArrayList;
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
public class UI {
    private Scanner reader;
    private PhoneDirectory directory;

    public UI(Scanner reader) {
        this.directory = new PhoneDirectory();
        this.reader = reader;
    }
    
    public void start() {
        showMenu();
        System.out.println("");
        takeInput();
    }
    
    public void showMenu() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }
    
    public void takeInput() {
        while(true) {
            System.out.print("command: ");
            String cmd = reader.next();
            
            if (cmd.equals("x")) {
                break;
            } else if (cmd.equals("1")) {
                addNumber();
            } else if (cmd.equals("2")) {
                searchNumber();
            } else if (cmd.equals("3")) {
                searchName();
            }
            
            
        }
    }
    
    public void addNumber() {
        Person person = new Person();
        System.out.print("whose number: ");
        String name = reader.next();
        System.out.print("number: ");
        String number = reader.next();
        System.out.println("");
        person.setName(name);
        person.setNumber(number);
        this.directory.addNumber(person, number);
    }
    
    public void searchNumber() {
        System.out.print("whose number: ");
        String name = reader.next();
        System.out.println("");
        List<String> numbers = directory.searchNumber(name);
        for (String num : numbers) {
            System.out.println(num);
        }
    }
    
    public void searchName() {
        System.out.print("number: ");
        String number = reader.next();
        System.out.println("");
        System.out.println(directory.searchPerson(number));
    }
}
