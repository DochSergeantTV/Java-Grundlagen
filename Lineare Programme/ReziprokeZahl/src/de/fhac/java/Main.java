package de.fhac.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input =  JOptionPane.showInputDialog("Zahl eingeben:");
        double inputZahl = Double.parseDouble(input);
        System.out.println("Zahl: " + (inputZahl) + ", Reziproke Zahl: " + (1/ (inputZahl)));
    }

}
