package main.java.complexlabs.menu.createBouquet.deleteFromBouquet;

import main.java.complexlabs.menu.MenuOption;

import static complexlabs.Bouquet.deleteAccessoryFromBouq;


public class DeleteAccessoryBouqOption implements MenuOption {

    @Override
    public void execute() {
        deleteAccessoryFromBouq();
    }

    @Override
    public String getOptionName() {
        return "Delete accessory from list";
    }
}
