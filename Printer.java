package com.company;

public class Printer {

    private String name;
    private String textToPrint;
    private String inkLevel;

    public Printer(String name, String inkLevel) {
        this.name = name;
        this.inkLevel = inkLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextToPrint() {
        return textToPrint;
    }

    public void setTextToPrint(String textToPrint) {
        this.textToPrint = textToPrint;
    }

    public String getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(String inkLevel) {
        this.inkLevel = inkLevel;
    }

    void printText(String textToPrint) {
        if (!inkLevel.equals("empty")) {
            System.out.println(textToPrint);
        } else {
            System.out.println("No ink available");
        }
    }

    void showInkLevel(String inkLevel){
        switch (inkLevel){
            case "empty":
                System.out.println("Empty------|----|----|------Full");
                System.out.println("===");
                break;
            case "low":
                System.out.println("Empty------|----|----|------Full");
                System.out.println("===========");
                break;
            case "medium":
                System.out.println("Empty------|----|----|------Full");
                System.out.println("=================");
                break;
            case "high":
                System.out.println("Empty------|----|----|------Full");
                System.out.println("======================");
                break;
            case "full":
                System.out.println("Empty------|----|----|------Full");
                System.out.println("===============================");
                break;
        }

    }
}
