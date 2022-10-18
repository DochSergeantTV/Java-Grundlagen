package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getNameOfMonth(-10));
    }
    public static String getNameOfMonth(int nr){
        if (nr < 1 || nr > 12) throw new ArithmeticException("Nicht im Wertebereich, bitte eine Zahl von 1 - 12 angeben");

        switch (nr){
            case 1 -> {
                return "Januar";
            }
            case 2 -> {
                return "Februar";
            }
            case 3 -> {
                return "Maerz";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "Mai";
            }
            case 6 -> {
                return "Juni";
            }
            case 7 -> {
                return "Juli";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "Oktober";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "Dezember";
            }
        }

        return "Error";
    }
}
