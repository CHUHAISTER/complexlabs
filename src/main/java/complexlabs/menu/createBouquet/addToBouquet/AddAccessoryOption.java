package main.java.complexlabs.menu.createBouquet.addToBouquet;

import main.java.complexlabs.menu.MenuOption;

import static complexlabs.Bouquet.addAccessoryFromFilteredList;


public class AddAccessoryOption implements MenuOption {

    @Override
    public void execute() { addAccessoryFromFilteredList();}

    @Override
    public String getOptionName() {
        return "Add accessory from list";
    }
}
