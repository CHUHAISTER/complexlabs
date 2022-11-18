package main.java.complexlabs.menu.createBouquet.deleteFromBouquet;

import main.java.complexlabs.menu.MenuOption;
import main.java.complexlabs.menu.createBouquet.printBouquetInfo.PrintflowersBouqOption;
import main.java.complexlabs.menu.exit.BackToPrevOption;

import java.util.LinkedHashMap;
import java.util.Map;

import static complexlabs.Bouquet.bouquetflowers;
import static main.java.complexlabs.inputoutput.output.printBanner;
import static main.java.complexlabs.menu.MenuFunctions.executeOption;
import static main.java.complexlabs.menu.MenuFunctions.printOptions;

public class DeleteflowerBouqMenu implements MenuOption {

    private Map<Integer, MenuOption> deleteflowerFromBouq;
    public DeleteflowerBouqMenu(){

        deleteflowerFromBouq = new LinkedHashMap<>();

        deleteflowerFromBouq.put(0, new BackToPrevOption());

    }

    @Override
    public void execute() {
        if(!bouquetflowers.isEmpty()){
            deleteflowerFromBouq.put(1, new DeleteflowerBouqOption());
            deleteflowerFromBouq.put(2, new PrintflowersBouqOption());
        }
        new PrintflowersBouqOption().execute();

        while(true) {
            if(bouquetflowers.isEmpty()){
                deleteflowerFromBouq.remove(1);
                deleteflowerFromBouq.remove(2);
                printBanner("No flowers to delete!");
            }

            printOptions(deleteflowerFromBouq);

            if(executeOption(deleteflowerFromBouq).getClass() == BackToPrevOption.class){
                return;
            }
        }
    }

    @Override
    public String getOptionName() {
        return "Delete flower from bouquet";
    }
}
