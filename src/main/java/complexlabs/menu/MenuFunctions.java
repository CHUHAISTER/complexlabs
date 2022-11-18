package main.java.complexlabs.menu;

import java.util.Map;

import static main.java.complexlabs.inputoutput.InputControl.enterCorrectInt;
import static main.java.complexlabs.inputoutput.output.*;

public class MenuFunctions {
    public static void printMenuOptions(Map<Integer, MenuOption> menu, String info){
        printBanner(info);
        menu.forEach((key, value) -> System.out.println(key + ". " + value.getOptionName()));
        System.out.println(simpleline);
    }

    public static void printOptions(Map<Integer, MenuOption> menu){
        System.out.println(simpleline);
        menu.forEach((key, value) -> System.out.println(key + ". " + value.getOptionName()));
        System.out.println(simpleline);
    }

    public static MenuOption executeOption(Map<Integer, MenuOption> menu){
        System.out.println("Choose option:");
        int numOption = enterCorrectInt();

        if(menu.get(numOption) != null){
           menu.get(numOption).execute();
           return menu.get(numOption);
        }
        else{
            printError("Oooops... Incorrect option. Try again");
            return executeOption(menu);
        }
    }
}
