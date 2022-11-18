package main.java.complexlabs.menu.changeAssortment.deleteAssortment;

import main.java.complexlabs.itemwithDB.AccessoryDB;
import main.java.complexlabs.menu.MenuOption;

public class DeleteAccessoryOption implements MenuOption {

    @Override
    public void execute() {
        AccessoryDB accessoryDao = new AccessoryDB();
        accessoryDao.deleteFromFiltered();
    }

    @Override
    public String getOptionName() {
        return null;
    }
}
