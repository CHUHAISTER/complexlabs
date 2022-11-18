package main.java.complexlabs.menu.createBouquet.printBouquetInfo;

import main.java.complexlabs.menu.MenuOption;

import static complexlabs.Bouquet.printBouquetAccessories;


public class PrintAccessoriesBouqOption implements MenuOption {

    @Override
    public void execute() {
        printBouquetAccessories();
    }

    @Override
    public String getOptionName() {
        return "Print the list of accessories in bouquet";
    }
}
