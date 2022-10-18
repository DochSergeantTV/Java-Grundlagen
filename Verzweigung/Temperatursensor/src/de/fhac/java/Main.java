package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getTemperaturText(10));
        System.out.println(getTemperaturText(27));
    }
    public static String getTemperaturText(double Temp){

        if (Temp <= 10) return "kalt";
        else if (Temp <= 25) return "lauwarm";
        else if (Temp <= 40) return "warm";
        else return "heiss";

    }
}
