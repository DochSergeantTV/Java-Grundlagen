package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(10));
    }

    public static int getFibonacciNumber(int n){
        if (n < 1) throw new ArithmeticException("Bitte eine Zahl groeßer als 0 angeben");

        int vorwert = 1;
        int vorwert2 = 0;
        int zahl = 0;

        for (int i = 1; i <= n ; i++){
            vorwert2 = vorwert;
            vorwert = zahl;
            zahl = vorwert + vorwert2;
        }
        return zahl;
    }
}
