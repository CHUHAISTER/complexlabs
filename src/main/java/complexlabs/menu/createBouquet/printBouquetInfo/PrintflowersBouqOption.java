package main.java.complexlabs.menu.createBouquet.printBouquetInfo;

import main.java.complexlabs.menu.MenuOption;

import static complexlabs.Bouquet.printBouquetflowers;


public class PrintflowersBouqOption implements MenuOption {

    @Override
    public void execute() {
        printBouquetflowers();
    }

    @Override
    public String getOptionName() {
        return "Print the list of flowers in bouquet";
    }
}
