package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(doubleBirthday(25));
    }

    public static double doubleBirthday(int size){
        double prohability = 1;

        if (size < 1) throw new ArithmeticException("Gruppe zu klein");

        for (int i = 364; i >= 365 - size + 1; i--){
            prohability = prohability * (((double)i)/365);
        }
        return prohability = 1 - prohability ;
    }
}
