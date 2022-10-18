package de.fhac.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        boolean korrekt = false;

        while (!korrekt){
            try{
                String z = JOptionPane.showInputDialog("Zaheler eingeben: ");
                String n = JOptionPane.showInputDialog("Nenner eingeben: ");
                int zaehler = Integer.parseInt(z);
                int nenner = Integer.parseInt(n);

                Bruch b = new Bruch(zaehler, nenner);

                Bruch c = new Bruch(1, 10);
                Bruch d = new Bruch(b);
                d.add(c);
                System.out.println(b);
                System.out.println(d);

                if(b.getNenner() < d.getNenner()){
                    System.out.println("Nenner von b ist kleiner zu Nenner von d"); // 10/2
                }else if(b.getNenner() == d.getNenner()){
                    System.out.println("Nenner von b ist gleich zu Nenner von d");
                } else if (b.getNenner() > d.getNenner()){
                    System.out.println("Nenner von b ist groesser zu Nenner von d"); // 7/10
                }
                korrekt = true;
            }catch (ArithmeticException e){
                System.out.println("Zähler oder Nenner falsch");
            }
        }

    }
}
