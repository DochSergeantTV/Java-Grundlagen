package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getPi(20000));
    }

    public static double getPi(int n){
        if (n < 1) throw new ArithmeticException("n muss größer als 0 sein");
        double pi = 0;
        double test = 3;

        for (double i=1; i <= n; i++){

            if (i % 2 == 0){
                pi = pi - 1/(test);
            }
            else {
                pi = pi + (1/(test));
            }
            test += 2;
        }
        return pi = 4 *(1-pi);

    }
}
