package main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.sortflowersByFresh;


public class SortByFreshflowerOption implements MenuOption {
    @Override
    public void execute() {
        sortflowersByFresh();
    }

    @Override
    public String getOptionName() {
        return "Sort flowers by fresh";
    }
}
