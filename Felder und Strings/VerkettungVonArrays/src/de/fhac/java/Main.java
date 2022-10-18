package de.fhac.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cocat(new int[]{10, 2, 5}, new int[]{3, 2})));
    }

    public static int[] cocat(int[] x1, int[] x2){
        int[] x3 = new int[x1.length + x2.length];
        System.arraycopy(x1, 0, x3, 0 , x1.length);
        System.arraycopy(x2, 0, x3, x1.length, x2.length);
        return x3;
    }
}
