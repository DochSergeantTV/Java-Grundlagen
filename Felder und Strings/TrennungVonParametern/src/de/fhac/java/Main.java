package de.fhac.java;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getParameters()));
    }
    public static int[] getParameters(){
        String Eingabe = JOptionPane.showInputDialog("Zahlen eingeben");

        String[] Umwandlung = Eingabe.split(",");
        int[] IntegerUmwandlung = new int[Umwandlung.length];
        for(int i = 0; i < Umwandlung.length; i++){
            IntegerUmwandlung[i] = Integer.parseInt(Umwandlung[i]);

        }
        return IntegerUmwandlung;
    }
}
