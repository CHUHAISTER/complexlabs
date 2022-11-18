package main.java.complexlabs.menu.createBouquet.addToBouquet;

import main.java.complexlabs.menu.createBouquet.PrintAvailableAccessoriesOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;
import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.sortFilterMenu.sortFilterAccessoryMenu.SortFilterAccessoryMenu;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.inputoutput.output.printBanner;
import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printOptions;
import static main.java.complexlabs.sortfilter.FilterAccessoriesWithEntering.filteredAccessories;


public class AddAccessoriesMenu implements MenuOption {
    private Map<Integer, MenuOption> addAccessoryMenu;

    public AddAccessoriesMenu(){

        addAccessoryMenu = new LinkedHashMap<>();

        addAccessoryMenu.put(0, new BackToPrevOption());

    }

    @Override
    public void execute(){

        SortFilterAccessoryMenu sortFilterAccessoryMenu = new SortFilterAccessoryMenu();
        sortFilterAccessoryMenu.execute();
        if(!filteredAccessories.isEmpty()){
            addAccessoryMenu.put(1, new AddAccessoryOption());
            addAccessoryMenu.put(2, new PrintAvailableAccessoriesOption());
        }

        new PrintAvailableAccessoriesOption().execute();

        while(true){
            if(filteredAccessories.isEmpty()){
                addAccessoryMenu.remove(1);
                addAccessoryMenu.remove(2);
                printBanner("No accessories to add!");
            }
            printOptions(addAccessoryMenu);

            if(executeOption(addAccessoryMenu).getClass() == BackToPrevOption.class){
                return;
            }
        }
    }

    @Override
    public String getOptionName() {
        return "Add accessories";
    }
}
