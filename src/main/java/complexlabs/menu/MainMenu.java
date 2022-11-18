package main.java.complexlabs.menu;

import main.java.complexlabs.menu.changeAssortment.ChangeAssortmentMenu;
import main.java.complexlabs.menu.createBouquet.CreateBouquetMenu;
import main.java.complexlabs.menu.exit.ExitOption;
import main.java.complexlabs.menu.printAssortment.PrintAssortmentMenu;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printMenuOptions;


/**
 * The main menu of the program which execute all possible methods in
 * program
 */
public class MainMenu {

    private Map<Integer, MenuOption> menuOptions;

    public MainMenu() {

        menuOptions = new LinkedHashMap<>();

        menuOptions.put(1, new PrintAssortmentMenu());

        menuOptions.put(2, new ChangeAssortmentMenu());

        menuOptions.put(3, new CreateBouquetMenu());

        menuOptions.put(4, new ExitOption());

    }

    public void execute(){
       while(true){
           printMenuOptions(menuOptions, "Main menu");
           executeOption(menuOptions);
       }
    }

}
