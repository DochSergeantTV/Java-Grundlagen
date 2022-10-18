package de.fhac.java;

public class Main {

    static double x1 = 2;
    static double y1 = 2;
    static double x2 = 6;
    static double y2 = 6;

    public static void main(String[] args) {
        System.out.println("Der Punktabstand von P1(" + x1 + "|" + y1 + ")  und P2("+ x2 + "|" + y2+ ")" + " beträgt: " + getDistance(x1, y1, x2, y2));
    }
    public static double getDistance(double x1, double y1, double x2, double y2){

        return Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));

    }
}
