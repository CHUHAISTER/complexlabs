package main.java.complexlabs;

import main.java.complexlabs.menu.MainMenu;

/**
 * The method main that call main menu of the program
 */
public class Main {

    public static void main(String[] args){
        MainMenu mainMenu = new MainMenu();
        mainMenu.execute();
    }
}