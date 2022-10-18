package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        int Wert = 200;
        System.out.println("Der Wert der Bestellung ist "+(Wert *100) + " Cent" + ", der Porto beträgt " + getPostage(Wert) + " Cent");
    }

    public static int getPostage(int order){
        if(order< 100) return 550;
        else if (order < 200) return 300;
        else return 0;
    }
}
