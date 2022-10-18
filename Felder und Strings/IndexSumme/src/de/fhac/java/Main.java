package de.fhac.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getIndexSumArray(3,5)));
    }
    public static int[][] getIndexSumArray(int a, int b){
        int[][] x1 = new int[a][b];
        for(int i = 0; i < x1.length; i++){
            for (int j = 0; j < x1[i].length; j++){
                x1[i][j] = i + j + 1;
            }
        }
        return x1;
    }
}
