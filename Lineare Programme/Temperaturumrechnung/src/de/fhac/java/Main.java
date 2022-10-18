package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getFahrenheit(10));
        System.out.println(getFahrenheit(55));
        System.out.println(getFahrenheit(-10));
    }

    public static double getFahrenheit(double celsius){

        return (celsius * (9/5d) + 32);
    }
}
