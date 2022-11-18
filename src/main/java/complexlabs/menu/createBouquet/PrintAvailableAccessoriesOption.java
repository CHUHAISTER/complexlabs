package main.java.complexlabs.menu.createBouquet;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterAccessoriesWithEntering.printFilteredAccessories;

public class PrintAvailableAccessoriesOption implements MenuOption {

    @Override
    public void execute() {
        printFilteredAccessories();
    }

    @Override
    public String getOptionName() {
        return "Print available accessories from search list";
    }
}
