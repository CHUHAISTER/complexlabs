package main.java.complexlabs.menu.printAssortment;

import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.sortFilterMenu.sortFilterFlowerMenu.SortFilterflowerMenu;

import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.printFilteredflowers;

public class PrintflowersOption implements MenuOption {

    @Override
    public void execute(){

        SortFilterflowerMenu sortFilterflowerMenu = new SortFilterflowerMenu();
        sortFilterflowerMenu.execute();
        printFilteredflowers();

    }

    @Override
    public String getOptionName() {
        return "Print flowers";
    }

}
