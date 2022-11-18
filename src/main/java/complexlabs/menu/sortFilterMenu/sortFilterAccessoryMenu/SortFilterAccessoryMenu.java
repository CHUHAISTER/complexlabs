package main.java.complexlabs.menu.sortFilterMenu.sortFilterAccessoryMenu;
import main.java.complexlabs.menu.MenuOption;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printMenuOptions;


public class SortFilterAccessoryMenu {

    private Map<Integer, MenuOption> sortFilterAccessoryMenu;

    public SortFilterAccessoryMenu() {

        sortFilterAccessoryMenu = new LinkedHashMap<>();

        sortFilterAccessoryMenu.put(1, new FilterTypeAccessoryOption());

        sortFilterAccessoryMenu.put(2, new FilterPriceAccessoryOption());

        sortFilterAccessoryMenu.put(3, new AllAccessoriesOption());
    }

    public void execute() {
        printMenuOptions(sortFilterAccessoryMenu, "Accessory filter menu");
        executeOption(sortFilterAccessoryMenu);
    }
}
