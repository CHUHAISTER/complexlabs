package main.java.complexlabs.menu.createBouquet.deleteFromBouquet;

import main.java.complexlabs.menu.MenuOption;

import static complexlabs.Bouquet.deleteflowerFromBouq;


public class DeleteflowerBouqOption implements MenuOption {
    @Override
    public void execute() {
        deleteflowerFromBouq();
    }

    @Override
    public String getOptionName() {
        return "Delete flower from list";
    }
}
