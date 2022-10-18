package de.fhac.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input =  JOptionPane.showInputDialog("Zahl eingeben:");
        double inputZahl = Double.parseDouble(input);

        System.out.println(Math.abs(inputZahl));
        System.out.println(Math.log(inputZahl));
        System.out.println(Math.sinh(inputZahl));

    }
}
