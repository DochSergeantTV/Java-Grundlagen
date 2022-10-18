package de.fhac.java;

import java.util.Arrays;

public class Domino {
    private int[] stein = new int[2];

    public Domino (int[] a){
        this.stein = a;
    }

    public int[] generator(){
        double min = 0;
        double max = 6;
        stein[0] = (int) (Math.random()* (max - min) + min);
        stein[1] = (int) (Math.random()* (max - min) + min);
        return this.stein;
    }

    @Override
    public String toString() {
        return "Domino{" +
                "stein=" + Arrays.toString(stein) +
                '}';
    }

    public void loop(int n){

        Kette k = new Kette();
        k.start(stein);

        for(int i = 0; n>= i; i++){
            generator();
            k.anhaengen(stein);
        }

        System.out.println(k);
    }
}
