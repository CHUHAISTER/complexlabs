package main.java.complexlabs.menu.sortFilterMenu.sortFilterflowerMenu;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.filterflowersInPriceRange;

public class FilterPriceflowerOption implements MenuOption {
    @Override
    public void execute() { filterflowersInPriceRange();}

    @Override
    public String getOptionName() {
        return "Filter flowers in price range";
    }
}
