package main.java.complexlabs.sortfilter;


import main.java.complexlabs.inputoutput.InputControl;
import main.java.complexlabs.items.accessory;

import java.util.ArrayList;

import static complexlabs.Bouquet.bouquetAccessories;
import static main.java.complexlabs.constants.accessorytype.getaccessorytype;
import static main.java.complexlabs.inputoutput.output.*;

public class FilterAccessoriesWithEntering {

    // Static arraylist of current filtering/sorting of accessories
    public static ArrayList<accessory> filteredAccessories = new ArrayList<>();

    /**
     * The method that searches for accessories of a given type that not in use
     * This method calls for the user to enter the filter parameters
     * @return The list of accessories of a given type
     */
    public static ArrayList<accessory> filterAccessoriesByType() {
        SortFilterAccessoriesDB sortFilterAccessoriesDB = new SortFilterAccessoriesDB();
        filteredAccessories = sortFilterAccessoriesDB.sortByType(getaccessorytype());
        filteredAccessories.removeAll(bouquetAccessories);
        return filteredAccessories;
    }

    /**
     * The method that returns all accessories that not in use
     * This method calls for the user to enter the filter parameters
     * @return The list of all accessories that not used
     */
    public static ArrayList<accessory> filterAllAccessories() {
        SortFilterAccessoriesDB sortFilterAccessoriesDB = new SortFilterAccessoriesDB();
        filteredAccessories = sortFilterAccessoriesDB.getAll();
        filteredAccessories.removeAll(bouquetAccessories);
        return filteredAccessories;
    }

    /**
     * The method that searches for accessories in a price range
     * The method asks the user to enter the search parameters (minimum and maximum limit)
     * @return The list of accessories in the price range
     */
    public static ArrayList<accessory> filterAccessInPriceRange() {

        SortFilterAccessoriesDB filtrationaccessory = new SortFilterAccessoriesDB();

        double min = filtrationaccessory.minPrice();
        double max = filtrationaccessory.maxPrice();

        printBanner("To filter by price, you must enter in which price range you are looking for accessories." +
                "\nStore accessory price range: min price - " + min + " max price - " + max);

        System.out.println("Type the min for your search in range [" + min + ", " + max + "] : ");
        double enteredMin = InputControl.enterDoubleInRange(min, max);

        printInfoEntering("Type the max for your search in range [" + min + ", " + max + "]" +
                " and bigger than " + enteredMin + ":");

        double enteredMax = InputControl.enterDoubleInRangeAndBiggerThan(min, max, enteredMin);
        filteredAccessories = filtrationaccessory.filterInPriceRange(enteredMin, enteredMax);
        filteredAccessories.removeAll(bouquetAccessories);
        return filteredAccessories;
    }

    public static void printFilteredAccessories() {
        printList(filteredAccessories, "accessory search result:");
    }
}
