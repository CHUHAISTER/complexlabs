package main.java.complexlabs.menu.printAssortment;

import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.sortFilterMenu.sortFilterAccessoryMenu.SortFilterAccessoryMenu;

import static main.java.complexlabs.sortfilter.FilterAccessoriesWithEntering.printFilteredAccessories;

public class PrintAccessoriesOption implements MenuOption {

    @Override
    public void execute(){

        SortFilterAccessoryMenu sortFilterAccessoryMenu = new SortFilterAccessoryMenu();
        sortFilterAccessoryMenu.execute();
        printFilteredAccessories();

    }

    @Override
    public String getOptionName() {
        return "Print accessories";
    }
}
