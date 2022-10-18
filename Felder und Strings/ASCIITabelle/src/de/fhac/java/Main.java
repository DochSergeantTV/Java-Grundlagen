package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        Rückgabe();
    }
    public static void Rückgabe(){
        int x = 0;
        while (x < 128){
            char y = (char)x;
            System.out.println( x + " = " + y);
            x++;
        }
    }
}
