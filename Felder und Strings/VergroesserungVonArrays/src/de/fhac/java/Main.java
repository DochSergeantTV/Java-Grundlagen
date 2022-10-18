package de.fhac.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(extendArray(new int[]{2,3,4,5}, 2)));
    }

    public static int[] extendArray(int[] ary, int n){
        int[] x3 = new int[ary.length + n];
        System.arraycopy(ary, 0, x3, 0, ary.length);
        return x3;
    }
}
