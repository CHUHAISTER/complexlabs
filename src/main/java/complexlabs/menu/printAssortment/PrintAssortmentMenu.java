package main.java.complexlabs.menu.printAssortment;


import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printMenuOptions;

public class PrintAssortmentMenu implements MenuOption {

    private Map<Integer, MenuOption> assortmentMenu;

    public PrintAssortmentMenu() {

        assortmentMenu = new LinkedHashMap<>();

        assortmentMenu.put(1, new PrintflowersOption());

        assortmentMenu.put(2, new PrintAccessoriesOption());

        assortmentMenu.put(3, new BackToPrevOption());
    }

    @Override
    public void execute(){
        do {
            printMenuOptions(assortmentMenu, "Assortment menu");
        } while (executeOption(assortmentMenu).getClass() != BackToPrevOption.class);
    }

    @Override
    public String getOptionName() {
        return "Print assortment";
    }

}
