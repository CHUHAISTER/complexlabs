package main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu;

import main.java.complexlabs.menu.MenuOption;


import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.filterflowersByType;

public class FilterTypeflowerOption implements MenuOption {

    @Override
    public void execute() {
       filterflowersByType();
    }

    @Override
    public String getOptionName() {
        return "Filter flowers by type";
    }
}
