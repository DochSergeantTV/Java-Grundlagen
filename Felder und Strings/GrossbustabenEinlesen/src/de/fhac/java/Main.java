package de.fhac.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(getCapitalString());
    }
    public static String getCapitalString(){
        String input = JOptionPane.showInputDialog("Gib etwas ein");
        StringBuilder Endstring = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char test = input.charAt(i);
            int value = test;

            if (value > 96 && value <= 122){
                value -= 32;
                test = (char)value;
                Endstring.append(test);
            }
            else Endstring.append(test);
        }
        return Endstring.toString();
    }
}
