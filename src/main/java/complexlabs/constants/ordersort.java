package main.java.complexlabs.constants;

import main.java.complexlabs.inputoutput.InputControl;
import static main.java.complexlabs.inputoutput.output.*;
import static java.lang.Boolean.TRUE;


public enum ordersort {
    DESC (1, "In descending order"),

    ASC (2, "In ascending order" );

    private final int numType;
    private final String name;

    ordersort(int type, String name) {
        this.numType = type;
        this.name = name;
    }

    public static void printordersortType(){
        printBanner("Types of order");
        for(ordersort type : ordersort.values()){
            System.out.println(type.numType + ". " + type.name);
        }
    }

    public static ordersort getordersortype(int indx){
        for(ordersort type : ordersort.values()){
            if(type.numType == indx){
                return type;
            }
        }
        printError("You type a wrong num! Try again");
        return null;
    }

    public static ordersort getordersorttype(){
        printordersortType();
        printInfoEntering("Choose the order type:");
        int numType = InputControl.enterCorrectInt();
        while (TRUE) {
            for (ordersort type : ordersort.values()) {
                if (type.numType == numType) {
                    return type;
                }
            }
            printError("You type a wrong num! Try again");
        }
        return null;
    }
}
