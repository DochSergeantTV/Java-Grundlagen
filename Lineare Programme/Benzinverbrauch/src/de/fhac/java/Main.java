package de.fhac.java;

public class Main {

    public static void main(String[] args) {
	    double guterVerbrauch = 8/100d;
        double schlechterVerbrauch = guterVerbrauch * 1.15d;
        int Tank = 40;

        System.out.println("Die Distanz auf guten Straßen ist: " + (Tank / guterVerbrauch));
        System.out.println("Die Distanz auf schlechten Straßen ist: " + (Tank / schlechterVerbrauch));
    }
}
