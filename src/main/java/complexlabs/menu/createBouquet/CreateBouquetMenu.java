package main.java.complexlabs.menu.createBouquet;

import main.java.complexlabs.menu.*;
import main.java.complexlabs.menu.createBouquet.addToBouquet.AddAccessoriesMenu;
import main.java.complexlabs.menu.createBouquet.addToBouquet.AddflowersMenu;
import main.java.complexlabs.menu.createBouquet.printBouquetInfo.PrintInfoBouqOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;

import java.util.LinkedHashMap;
import java.util.Map;

import static complexlabs.Bouquet.refreshBouquet;
import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printMenuOptions;


public class CreateBouquetMenu implements MenuOption {

    private Map<Integer, MenuOption> createBouqOptions;


    public CreateBouquetMenu(){

        createBouqOptions = new LinkedHashMap<>();

        createBouqOptions.put(1, new AddflowersMenu());

        createBouqOptions.put(2, new AddAccessoriesMenu());

        createBouqOptions.put(3, new PrintInfoBouqOption());

        createBouqOptions.put(4, new ChangeBouquetMenu());

        createBouqOptions.put(5, new BuyThisBouquetOption());

        createBouqOptions.put(6, new BackToPrevOption());

    }


    @Override
    public void execute(){

        while(true){
            printMenuOptions(createBouqOptions,"Creator of bouquet");
            if(executeOption(createBouqOptions).getClass() == BackToPrevOption.class){
                refreshBouquet();
                return;
            }
        }
    }

    @Override
    public String getOptionName() {
        return "Create bouquet";
    }
}
