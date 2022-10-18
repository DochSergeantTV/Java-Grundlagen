package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDoubleRandom(2, 10));
        System.out.println(getIntRandom(2, 10));
    }

    public static double getDoubleRandom(double min, double max){
        return ((Math.random() * (max - min)) + min);
    }

    public static int getIntRandom(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
}
