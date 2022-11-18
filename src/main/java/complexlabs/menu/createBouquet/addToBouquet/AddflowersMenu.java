package main.java.complexlabs.menu.createBouquet.addToBouquet;

import main.java.complexlabs.menu.createBouquet.PrintAvailableflowersOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;
import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.sortFilterMenu.sortFilterFlowerMenu.SortFilterflowerMenu;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.inputoutput.output.printBanner;
import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printOptions;
import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.filteredflowers;

public class AddflowersMenu implements MenuOption {

    private Map<Integer, MenuOption> addflowerMenu;

    public AddflowersMenu(){

        addflowerMenu = new LinkedHashMap<>();

        addflowerMenu.put(0, new BackToPrevOption());

    }

    @Override
    public void execute() {

        SortFilterflowerMenu sortFilterflowerMenu = new SortFilterflowerMenu();
        sortFilterflowerMenu.execute();
        if (!filteredflowers.isEmpty()) {
            addflowerMenu.put(1, new AddflowerOption());
            addflowerMenu.put(2, new PrintAvailableflowersOption());
        }

        new PrintAvailableflowersOption().execute();

        while (true) {
            if (filteredflowers.isEmpty()) {
                addflowerMenu.remove(1);
                addflowerMenu.remove(2);
                printBanner("No flowers to add!");
            }
            printOptions(addflowerMenu);

            if (executeOption(addflowerMenu).getClass() == BackToPrevOption.class) {
                return;
            }
        }
    }

    @Override
    public String getOptionName() {
        return "Add flowers";
    }
}
