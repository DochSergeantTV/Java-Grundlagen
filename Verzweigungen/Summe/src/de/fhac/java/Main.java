package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getNextPartialSum(11));
    }
    public static int getNextPartialSum(int v){
        if (v < 1) throw new ArithmeticException("Fehler");

        int summe= 0;
        for (int i = 1; i <= v ; i++){
            summe = summe + i;
            if (summe >= v){
                break;
            }
        }
        return summe;
    }
}
