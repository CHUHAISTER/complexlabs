package main.java.complexlabs.menu.createBouquet.deleteFromBouquet;

import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.createBouquet.printBouquetInfo.PrintAccessoriesBouqOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import static complexlabs.Bouquet.bouquetAccessories;
import static main.java.complexlabs.inputoutput.output.printBanner;
import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printOptions;

public class DeleteAccessoriesBouqMenu implements MenuOption {

    private Map<Integer, MenuOption> deleteAccessoryMenu;

    public DeleteAccessoriesBouqMenu() {
        deleteAccessoryMenu = new LinkedHashMap<>();

        deleteAccessoryMenu.put(0, new BackToPrevOption());
    }

    @Override
    public void execute() {

        if(!bouquetAccessories.isEmpty()){
            deleteAccessoryMenu.put(1, new DeleteAccessoryBouqOption());
            deleteAccessoryMenu.put(2, new PrintAccessoriesBouqOption());
        }
        new PrintAccessoriesBouqOption().execute();

        while(true) {
            if(bouquetAccessories.isEmpty()){
                deleteAccessoryMenu.remove(1);
                deleteAccessoryMenu.remove(2);
                printBanner("No accessories to delete!");
            }
            printOptions(deleteAccessoryMenu);

            if(executeOption(deleteAccessoryMenu).getClass() == BackToPrevOption.class){
                return;
            }
        }
    }



    @Override
    public String getOptionName() {
        return "Delete accessory from bouquet";
    }
}
