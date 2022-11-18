package main.java.complexlabs;

import main.java.complexlabs.menu.MainMenu;


//    public static Logger  LOGI = LogManager.getLogger(LoggerInfo.class);

/**
 * The method main that call main menu of the program
 */
public class Main {

    public static void main(String[] args){
        main.java.complexlabs.Database.getConnection();
        MainMenu mainMenu = new MainMenu();
        mainMenu.execute();
    }
}