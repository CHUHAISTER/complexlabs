package main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.filterflowersInLengthRange;

public class FilterLengthflowerOption implements MenuOption {
    @Override
    public void execute() { filterflowersInLengthRange();}

    @Override
    public String getOptionName() {
        return "Filter flowers in length range";
    }
}
