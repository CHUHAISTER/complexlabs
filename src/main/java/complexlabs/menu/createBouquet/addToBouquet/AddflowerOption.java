package main.java.complexlabs.menu.createBouquet.addToBouquet;

import main.java.complexlabs.menu.MenuOption;

import static complexlabs.Bouquet.addflowerFromFilteredList;



public class AddflowerOption implements MenuOption {

    @Override
    public void execute() {
        addflowerFromFilteredList();
    }

    @Override
    public String getOptionName() {
        return "Add flower from list";
    }

}
