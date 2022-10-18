package de.fhac.java;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Kette {
    private int[] kette;
    private int[] ketteG;


    public void start(int[] a){
        kette = copyOf(a, a.length);
    }

    public void anhaengen(int[] a){
        int zahl;
        zahl = kette[kette.length-1];

        if(zahl == a[0]){
            int[] ketteG = new int[kette.length+a.length];

            for(int i = 0; i< kette.length; i++){
                ketteG[i] = kette[i];
            }
            for(int i = 0; i< a.length; i++){
                ketteG[i+ kette.length] = a[i];
            }

            this.kette = new int[ketteG.length];
            for(int i = 0; i< ketteG.length; i++){

                this.kette[i] = ketteG[i];

            }

        } else if (zahl == a[1]){
            int buffer = a[0];
            a[0] = a[1];
            a[1] = buffer;

            int[] ketteG = new int[kette.length+a.length];

            for(int i = 0; i< kette.length; i++){
                ketteG[i] = kette[i];
            }
            for(int i = 0; i< a.length; i++){
                ketteG[i+ kette.length] = a[i];
            }

            this.kette = new int[ketteG.length];
            for(int i = 0; i< ketteG.length; i++){

                this.kette[i] = ketteG[i];
            }

        }

    }

    @Override
    public String toString() {
        return "Kette{" +
                "Kette=" + Arrays.toString(kette) +
                '}';
    }
}
