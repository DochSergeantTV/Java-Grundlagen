package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(gcd(16,4));
    }

    public static int gcd(int a, int b){
        if (a < 1) throw new ArithmeticException("a muss groesser als 1 sein");
        if (b < 1) throw new ArithmeticException("b muss groesser als 1 sein");

        while (b != 0){
            if (a > b){
                a = a -b;
            }
            b = b - a;
        }
        return a;
    }
}
