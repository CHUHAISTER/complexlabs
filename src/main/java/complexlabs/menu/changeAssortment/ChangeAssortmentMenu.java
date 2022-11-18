package main.java.complexlabs.menu.changeAssortment;



import main.java.complexlabs.menu.changeAssortment.addAssortment.AddNewAccessoryOption;
import main.java.complexlabs.menu.changeAssortment.addAssortment.AddNewflowerOption;
import main.java.complexlabs.menu.changeAssortment.deleteAssortment.DeleteAccessoriesMenu;
import main.java.complexlabs.menu.changeAssortment.deleteAssortment.DeleteflowersMenu;
import main.java.complexlabs.menu.exit.BackToPrevOption;
import main.java.complexlabs.menu.MenuOption;

import java.util.LinkedHashMap;
import java.util.Map;

import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printMenuOptions;


public class ChangeAssortmentMenu implements MenuOption {

    private Map<Integer, MenuOption> changeAssortmentMenu;

    public ChangeAssortmentMenu() {

        changeAssortmentMenu = new LinkedHashMap<>();

        changeAssortmentMenu.put(1, new AddNewflowerOption());

        changeAssortmentMenu.put(2, new AddNewAccessoryOption());

        changeAssortmentMenu.put(3, new DeleteflowersMenu());

        changeAssortmentMenu.put(4, new DeleteAccessoriesMenu());

        changeAssortmentMenu.put(5, new BackToPrevOption());
    }

    @Override
    public void execute() {
        do {
            printMenuOptions(changeAssortmentMenu, "Change assortment menu");
        } while (executeOption(changeAssortmentMenu).getClass() != BackToPrevOption.class);
    }

    @Override
    public String getOptionName() {
        return "Change assortment";
    }
}
