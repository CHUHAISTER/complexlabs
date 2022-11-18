package main.java.complexlabs.menu.sortFilterMenu.sortFilterFlowerMenu;

import main.java.complexlabs.menu.MenuOption;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printMenuOptions;


public class SortFilterflowerMenu {

    private Map<Integer, MenuOption> sortFilterflowerMenu;

    public SortFilterflowerMenu(){

        sortFilterflowerMenu = new LinkedHashMap<>();

        sortFilterflowerMenu.put(1, new main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu.FilterTypeflowerOption());

        sortFilterflowerMenu.put(2, new main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu.FilterPriceflowerOption());

        sortFilterflowerMenu.put(3, new main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu.FilterLengthflowerOption());

        sortFilterflowerMenu.put(4, new main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu.SortByFreshflowerOption());

        sortFilterflowerMenu.put(5, new main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu.AllflowersOption());

    }

    public void execute() {
        printMenuOptions(sortFilterflowerMenu,"flowers filter menu");
        executeOption(sortFilterflowerMenu);
    }
}
