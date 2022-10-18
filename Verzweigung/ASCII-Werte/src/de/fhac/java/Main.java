package de.fhac.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        while(true){
            String eingabe = JOptionPane.showInputDialog("Bitte eine Zahl eingeben: ");
            int zahl = Integer.parseInt(eingabe);
            if (zahl == 0)break;

            char b = (char) zahl;
            System.out.println(b);
        }



    }
}
