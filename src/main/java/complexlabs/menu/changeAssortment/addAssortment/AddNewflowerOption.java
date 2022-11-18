package main.java.complexlabs.menu.changeAssortment.addAssortment;


import main.java.complexlabs.itemwithDB.flowerDB;
import main.java.complexlabs.menu.MenuOption;

public class AddNewflowerOption implements MenuOption {

    @Override
    public void execute() {
        flowerDB fDB = new flowerDB();
        fDB.insertWithEntering();
    }

    @Override
    public String getOptionName() {
        return "Add new flower";
    }
}
