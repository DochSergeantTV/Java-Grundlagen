package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        int max = 5;
        for (int i = 1; i <= max; i++) {
            for (int k=max - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
