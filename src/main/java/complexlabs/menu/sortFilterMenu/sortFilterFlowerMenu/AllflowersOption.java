package main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.filterAllflowers;

public class AllflowersOption implements MenuOption {
    @Override
    public void execute() {
        filterAllflowers();
    }

    @Override
    public String getOptionName() {
        return "All flowers";
    }
}
