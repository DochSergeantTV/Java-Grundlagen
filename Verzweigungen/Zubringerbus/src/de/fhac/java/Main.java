package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getWaiting(20, 40));
    }

    public static int getWaiting(int h, int min){
        if (min == 0) return 0;
        else if (min <= 30) return (30 - min);
        else if (min <= 59)return (60 - min);
        return h;
    }
}
