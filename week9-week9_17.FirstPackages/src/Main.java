/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;
import mooc.logic.ApplicationLogic;


public class Main {
    
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
    
}