package de.fhac.java;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    Point p1 = new Point(Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben: ")),Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben: ")));
        Point p2 = new Point(Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben: ")),Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben: ")));

        p1.move(p1.x + 10, p1.y + 10);
        p2.move(p2.x + 10,p2.y + 10);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
    }
}
