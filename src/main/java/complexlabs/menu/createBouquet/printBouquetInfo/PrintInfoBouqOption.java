package main.java.complexlabs.menu.createBouquet.printBouquetInfo;

import main.java.complexlabs.menu.MenuOption;

import static complexlabs.Bouquet.printBouquetInfo;

public class PrintInfoBouqOption implements MenuOption {

    @Override
    public void execute() {
        printBouquetInfo();
    }

    @Override
    public String getOptionName() {
        return "Print info about this bouquet";
    }
}
