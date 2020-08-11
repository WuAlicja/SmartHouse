package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Printer> printers = new ArrayList<>();
        printers.add(new Printer("HP1234", "full"));
        printers.add(new Printer("Dell", "medium"));
        printers.add(new Printer("HP1440", "low"));
        printers.add(new Printer("HP800IJ", "empty"));
        printers.add(new Printer("HP12X32", "full"));

        printOnDefinedPrinter("Dell",printers,"Ala ma kota");
        printOnAllPrinters(printers,"Kot ma Ale");
        showInkLevel("HP800IJ",printers);
        showInkLevelForAllPrinters(printers);

    }

    static void printOnDefinedPrinter(String printerName, List<Printer> printers, String myTextToPrint) {
        for (Printer printer : printers
        ) {
            if (printer.getName().equals(printerName)) {
                System.out.println(printerName);
                printer.printText(myTextToPrint);
            }
        }
    }

    static void printOnAllPrinters(List<Printer> printers, String myTextToPrint) {
        for (Printer printer : printers
        ) {
            System.out.println(printer.getName());
            printer.printText(myTextToPrint);
        }
    }

    static void showInkLevel(String printerName, List<Printer> printers) {
        for (Printer printer : printers
        ) {
            if (printer.getName().equals(printerName)) {
                System.out.println(printerName);
                printer.showInkLevel(printer.getInkLevel());
            }
        }
    }

    static void showInkLevelForAllPrinters(List<Printer> printers) {
        for (Printer printer : printers
        ) {
            System.out.println(printer.getName());
            printer.showInkLevel(printer.getInkLevel());
        }
    }
}

