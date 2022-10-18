package de.fhac.java;

import javax.swing.*;
import java.lang.reflect.GenericSignatureFormatError;

public class Main {

    public static void main(String[] args) {

        int durchlauf = 0;
        double gesamtsumme = 0;

        while (true){
        String Eingabe = JOptionPane.showInputDialog("Bitte gib eine Zahl ein");
        double zahl = Double.parseDouble(Eingabe);

        gesamtsumme +=zahl;



        if (zahl == 0){
            double durchschnitt = gesamtsumme/durchlauf;
            System.out.println("Gesamtsumme = "+ gesamtsumme + ", Durchschnitt = " + durchschnitt);
            break;
        }
            durchlauf++;
            System.out.println(zahl);
    }
    }
}
