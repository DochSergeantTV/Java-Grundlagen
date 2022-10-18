package de.fhac.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       printArray(new int[2][3]);
    }
    public static void printArray(int[][] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println("");

        }

    }

}
