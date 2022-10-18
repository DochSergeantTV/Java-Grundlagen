package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        int a[][] = new int[3][2];
        System.out.println(isSquare(a));
    }

    public static boolean isSquare(int[][] test){
        int differrenz = 0;
        for (int i = 0; i < test.length;i++){
            for (int j = 0; j < test[i].length; j++){
               differrenz  = i - j;
            }
        }
        if (differrenz == 0){
            return true;
        }
        return false;
    }
}
