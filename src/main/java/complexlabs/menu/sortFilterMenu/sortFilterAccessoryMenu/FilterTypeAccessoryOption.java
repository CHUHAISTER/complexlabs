package main.java.complexlabs.menu.sortFilterMenu.sortFilterAccessoryMenu;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterAccessoriesWithEntering.filterAccessoriesByType;

public class FilterTypeAccessoryOption implements MenuOption {

    @Override
    public void execute() {
        filterAccessoriesByType();
    }

    @Override
    public String getOptionName() {
        return "Filter accessories by type";
    }
}
