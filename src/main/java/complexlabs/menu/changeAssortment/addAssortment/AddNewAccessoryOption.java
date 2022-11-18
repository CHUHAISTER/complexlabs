package main.java.complexlabs.menu.changeAssortment.addAssortment;

import main.java.complexlabs.itemwithDB.AccessoryDB;
import main.java.complexlabs.menu.MenuOption;

public class AddNewAccessoryOption implements MenuOption {

    @Override
    public void execute(){
        AccessoryDB aDao = new AccessoryDB();
        aDao.insertWithEntering();
    }

    @Override
    public String getOptionName() {
        return "Add new accessory";
    }
}
