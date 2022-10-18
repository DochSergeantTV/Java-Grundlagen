package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("x = " + solveLinearEquation(1, 0));
    }
    public static double solveLinearEquation(double a, double b) {
        if (a == 0) throw new ArithmeticException("Gleichung nicht lösbar, da a = 0");
        return -b / a;
    }
}
