package main.java.complexlabs.menu.changeAssortment.deleteAssortment;


import main.java.complexlabs.itemwithDB.flowerDB;

public class DeleteflowerOption implements main.java.complexlabs.menu.MenuOption {

    @Override
    public void execute() {
        flowerDB flowerDao = new flowerDB();
        flowerDao.deleteFromFiltered();
    }

    @Override
    public String getOptionName() {
        return "Delete flower from list";
    }
}
