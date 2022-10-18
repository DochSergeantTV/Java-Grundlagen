package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        int[] a = {2,3};
        Domino d = new Domino(a);

        d.loop(500000);
    }
}
