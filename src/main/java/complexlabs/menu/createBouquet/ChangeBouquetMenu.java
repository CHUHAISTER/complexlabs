package main.java.complexlabs.menu.createBouquet;

import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.createBouquet.deleteFromBouquet.DeleteflowerBouqMenu;
import main.java.complexlabs.menu.createBouquet.deleteFromBouquet.DeleteAccessoriesBouqMenu;
import main.java.complexlabs.menu.createBouquet.printBouquetInfo.PrintInfoBouqOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printMenuOptions;


public class ChangeBouquetMenu implements MenuOption {

    private Map<Integer, MenuOption> changeBouqOptions;

    public ChangeBouquetMenu() {

        changeBouqOptions = new LinkedHashMap<>();

        changeBouqOptions.put(1, new DeleteAccessoriesBouqMenu());

        changeBouqOptions.put(2, new DeleteflowerBouqMenu());

        changeBouqOptions.put(3, new PrintInfoBouqOption());

        changeBouqOptions.put(0, new BackToPrevOption());
    }

    @Override
    public void execute() {
        do {
            printMenuOptions(changeBouqOptions, "Change bouquet menu" );
        } while (executeOption(changeBouqOptions).getClass() == BackToPrevOption.class);

    }

    @Override
    public String getOptionName() {
        return "Change bouquet";
    }
}
