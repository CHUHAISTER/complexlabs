package main.java.complexlabs.menu.createBouquet;

import main.java.complexlabs.menu.MenuOption;

import static complexlabs.Bouquet.buyBouquetDAO;


public class BuyThisBouquetOption implements MenuOption {

    @Override
    public void execute() {
        buyBouquetDAO();
    }

    @Override
    public String getOptionName() {
        return "Buy this bouquet";
    }
}
