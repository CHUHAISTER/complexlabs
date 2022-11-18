package main.java.complexlabs.menu.createBouquet;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.printFilteredflowers;

public class PrintAvailableflowersOption implements MenuOption {

    @Override
    public void execute() {
        printFilteredflowers();
    }

    @Override
    public String getOptionName() {
        return "Print available flowers from search list";
    }
}
