package main.java.complexlabs.menu.changeAssortment.deleteAssortment;

import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.createBouquet.PrintAvailableAccessoriesOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;
import main.java.complexlabs.menu.sortFilterMenu.sortFilterAccessoryMenu.SortFilterAccessoryMenu;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.inputoutput.output.printBanner;
import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printOptions;
import static main.java.complexlabs.sortfilter.FilterAccessoriesWithEntering.filteredAccessories;


public class DeleteAccessoriesMenu implements MenuOption {

    private Map<Integer, MenuOption> deleteAccessoryMenu;

    public DeleteAccessoriesMenu() {

        deleteAccessoryMenu = new LinkedHashMap<>();

        deleteAccessoryMenu.put(0, new BackToPrevOption());
    }


    @Override
    public void execute() {

        SortFilterAccessoryMenu sortFilterAccessoryMenu = new SortFilterAccessoryMenu();
        sortFilterAccessoryMenu.execute();
        if(!filteredAccessories.isEmpty()){
            deleteAccessoryMenu.put(1, new DeleteAccessoryOption());
            deleteAccessoryMenu.put(2, new PrintAvailableAccessoriesOption());
        }

        new PrintAvailableAccessoriesOption().execute();

        while(true){

            if(filteredAccessories.isEmpty()){
                deleteAccessoryMenu.remove(1);
                deleteAccessoryMenu.remove(2);
                printBanner("No flowers to delete!");
            }

            printOptions(deleteAccessoryMenu);

            if(executeOption(deleteAccessoryMenu).getClass() == BackToPrevOption.class){
                return;
            }
        }
    }

    @Override
    public String getOptionName() {
        return "Delete accessory";
    }
}
