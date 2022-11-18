package main.java.complexlabs.menu.sortFilterMenu.sortFilterAccessoryMenu;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterAccessoriesWithEntering.filterAccessInPriceRange;

public class FilterPriceAccessoryOption implements MenuOption {
    @Override
    public void execute() {
        filterAccessInPriceRange();
    }

    @Override
    public String getOptionName() {
        return "Filter accessories in price range";
    }
}
