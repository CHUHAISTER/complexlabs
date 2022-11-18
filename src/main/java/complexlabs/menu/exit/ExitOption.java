package main.java.complexlabs.menu.exit;

import main.java.complexlabs.menu.MenuOption;

import static main.java.complexlabs.inputoutput.output.printBanner;


public class ExitOption  implements MenuOption {

    public ExitOption() {}

    @Override
    public void execute() {
        printBanner("Program execution is complete. Have a nice day! =)");
        System.exit(0);
    }

    public String getOptionName(){
        return "Exit";
    }
}
