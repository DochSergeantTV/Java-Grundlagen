package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getFactorial(16));
    }

    public static int getFactorial(int x) {
        if (x < 0) throw new ArithmeticException("Faktultät kann nicht kleiner als 0 sein");

        int fakultaet = 1;
        for (int i = 1; i <= x; i++) {
            fakultaet = fakultaet * i;
        }
        return fakultaet;
    }
}