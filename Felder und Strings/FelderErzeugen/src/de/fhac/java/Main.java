package de.fhac.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getDoubleArray(10, 10)));
    }

    public static double[][] getDoubleArray(int x, int y){
        return new double[x][y];
    }
}
