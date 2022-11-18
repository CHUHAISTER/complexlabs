package main.java.complexlabs.menu.sortFilterMenu.sortFilterAccessoryMenu;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterAccessoriesWithEntering.filterAllAccessories;

public class AllAccessoriesOption implements MenuOption {

    @Override
    public void execute() {
        filterAllAccessories();
    }

    @Override
    public String getOptionName() {
        return "All accessories";
    }
}
