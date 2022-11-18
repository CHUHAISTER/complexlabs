package main.java.complexlabs.menu.changeAssortment.deleteAssortment;


import main.java.complexlabs.menu.createBouquet.PrintAvailableflowersOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;
import main.java.complexlabs.menu.sortFilterMenu.sortFilterFlowerMenu.SortFilterflowerMenu;
import main.java.complexlabs.menu.MenuOption;

import java.util.LinkedHashMap;
import java.util.Map;


import static main.java.complexlabs.inputoutput.output.printBanner;
import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printOptions;
import static main.java.complexlabs.sortfilter.FilterflowersWithEntering.filteredflowers;

public class DeleteflowersMenu implements MenuOption {

    private Map<Integer, MenuOption> deleteflowerMenu;

    public DeleteflowersMenu() {
        deleteflowerMenu = new LinkedHashMap<>();

        deleteflowerMenu.put(0, new BackToPrevOption());
    }

    @Override
    public void execute() {

        SortFilterflowerMenu sortFilterflowerMenu = new SortFilterflowerMenu();
        sortFilterflowerMenu.execute();
        if(!filteredflowers.isEmpty()){
            deleteflowerMenu.put(1, new DeleteflowerOption());
            deleteflowerMenu.put(2, new PrintAvailableflowersOption());
        }

        new PrintAvailableflowersOption().execute();

        while(true){
            if(filteredflowers.isEmpty()){
                deleteflowerMenu.remove(1);
                deleteflowerMenu.remove(2);
                printBanner("No flowers to delete!");
            }

            printOptions(deleteflowerMenu);

            if(executeOption(deleteflowerMenu).getClass() == BackToPrevOption.class){
                return;
            }
        }
    }

    @Override
    public String getOptionName() {
        return "Delete flower";
    }
}
